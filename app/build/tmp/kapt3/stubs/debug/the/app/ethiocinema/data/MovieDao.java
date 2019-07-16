package the.app.ethiocinema.data;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\'J\u0014\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n0\tH\'J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0005H\'J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0005H\'\u00a8\u0006\u000f"}, d2 = {"Lthe/app/ethiocinema/data/MovieDao;", "", "ClearAllMovies", "", "getInfo", "Lthe/app/ethiocinema/data/Movie;", "id", "", "getMovies", "Landroidx/lifecycle/LiveData;", "", "insertMovie", "", "movie", "updateMovie", "app_debug"})
public abstract interface MovieDao {
    
    @androidx.room.Update()
    public abstract int updateMovie(@org.jetbrains.annotations.NotNull()
    the.app.ethiocinema.data.Movie movie);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract long insertMovie(@org.jetbrains.annotations.NotNull()
    the.app.ethiocinema.data.Movie movie);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "select * from Movies")
    public abstract androidx.lifecycle.LiveData<java.util.List<the.app.ethiocinema.data.Movie>> getMovies();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "select * from Movies where mid=:id")
    public abstract the.app.ethiocinema.data.Movie getInfo(int id);
    
    @androidx.room.Query(value = "Delete from Movies ")
    public abstract void ClearAllMovies();
}