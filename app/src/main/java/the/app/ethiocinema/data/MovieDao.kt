package the.app.ethiocinema.data
import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface MovieDao {


    @Update
    fun updateMovie(movie:Movie):Int

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertMovie(movie: Movie):Long

    @Query("select * from Movies")
    fun getMovies() :LiveData<List<Movie>>

    @Query("select * from Movies where mid=:id")
    fun getInfo(id: Int) :Movie

    @Query("Delete from Movies ")
    fun ClearAllMovies()
}