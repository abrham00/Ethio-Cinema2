package the.app.ethiocinema


import android.app.Activity
import android.app.AlertDialog
import android.content.Intent
import android.graphics.Color
import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import android.view.View
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragmenthome.*
import kotlinx.android.synthetic.main.one_cinema_view.view.*
import kotlinx.android.synthetic.main.one_movie_view.view.*
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import the.app.ethiocinema.ViewPagerAdapter
import the.app.ethiocinema.data.*
import the.app.ethiocinema.repository.CinemaRepo
import the.app.ethiocinema.repository.MovieRepo
import the.app.ethiocinema.repository.ScheduleRepo

class MainActivity : AppCompatActivity() {
    val act: Activity =this
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val db1= db.getDatabase(applicationContext)
        val movieDao=db1.movieDao()
        val scheduleDao=db1.scheduleDao()
        val cinemaDao=db1.cinemaDao()
        val cinemaRepo=CinemaRepo(cinemaDao)
        val scheduleRepo=ScheduleRepo(scheduleDao)
        val movieRepo= MovieRepo(movieDao)


        GlobalScope.launch{
            movieRepo.clear()
            cinemaRepo.clear()
            scheduleRepo.clear()
            var moviesList: List<Movie>?=null
            var cinemaList: List<Cinema>?=null
            var scheduleList: List<Schedule>?=null
            try {
                moviesList=movieRepo.getMoviesFromNet().execute().body()
                cinemaList=cinemaRepo.getCinemaFromNet().execute().body()
                scheduleList=scheduleRepo.getScheduleFromNet().execute().body()
            }
            catch (ex:Exception){
                runOnUiThread{
                    Toast.makeText(act,"Connection Error...",Toast.LENGTH_LONG).show()
                }
            }
            if (moviesList!=null){
                for (movie in moviesList){
                    movieRepo.Save(movie)
                }

            }
            if (cinemaList!=null){
                for(cinema in cinemaList){
                    cinemaRepo.Save(cinema)
                }
            }
            if (scheduleList!=null){
                for(schedule in scheduleList){
                    scheduleRepo.Save(schedule)
                }
            }
        }
    }
    fun movieDetail(view:View){
        val builder = AlertDialog.Builder(this@MainActivity)
        val movid:Int=Integer.parseInt(view.idTextMovie.text.toString())
        GlobalScope.launch {
            val db1= db.getDatabase(applicationContext)
            val movieDao=db1.movieDao()
            val movieRepo= MovieRepo(movieDao)
            val detMov=movieRepo.getMovieDetail(movid)
            runOnUiThread{
                builder.setTitle(detMov.name)
                builder.setMessage(detMov.description +"\n"+detMov.length+"\n"+detMov.genere+"\n"+detMov.showingcinema)
                builder.setPositiveButton("Ok"){dialog, which ->
                    }
                val dialog: AlertDialog = builder.create()
                dialog.show()
            }
        }

    }
    fun toCinemaDetail(view: View){
        val name=view.cinema_na.text.toString()
        var bundle= bundleOf("cinemaname" to name)
        val navController1 = Navigation.findNavController(this, R.id.main_frame)
        navController1.navigate(R.id.action_mainFragment_to_cinemaDetail,bundle)

    }
}
