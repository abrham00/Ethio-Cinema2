package the.app.ethiocinema.viewModel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bJ\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0011R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lthe/app/ethiocinema/viewModel/MovieViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "allMovies", "Landroidx/lifecycle/LiveData;", "", "Lthe/app/ethiocinema/data/Movie;", "getAllMovies", "()Landroidx/lifecycle/LiveData;", "movieRepo", "Lthe/app/ethiocinema/repository/MovieRepo;", "Save", "", "mov", "getMovieFromNet", "Lretrofit2/Call;", "app_debug"})
public final class MovieViewModel extends androidx.lifecycle.AndroidViewModel {
    private final the.app.ethiocinema.repository.MovieRepo movieRepo = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<the.app.ethiocinema.data.Movie>> allMovies = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<the.app.ethiocinema.data.Movie>> getAllMovies() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Call<java.util.List<the.app.ethiocinema.data.Movie>> getMovieFromNet() {
        return null;
    }
    
    public final long Save(@org.jetbrains.annotations.NotNull()
    the.app.ethiocinema.data.Movie mov) {
        return 0L;
    }
    
    public MovieViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}