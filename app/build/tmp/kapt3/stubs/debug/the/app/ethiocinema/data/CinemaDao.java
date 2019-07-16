package the.app.ethiocinema.data;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u0014\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005H\'J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00052\u0006\u0010\t\u001a\u00020\nH\'J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0007H\'\u00a8\u0006\u000e"}, d2 = {"Lthe/app/ethiocinema/data/CinemaDao;", "", "clear", "", "getCinema", "Landroidx/lifecycle/LiveData;", "", "Lthe/app/ethiocinema/data/Cinema;", "getInfo", "name", "", "insertCinema", "", "cinema", "app_debug"})
public abstract interface CinemaDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract long insertCinema(@org.jetbrains.annotations.NotNull()
    the.app.ethiocinema.data.Cinema cinema);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "select * from Cinema")
    public abstract androidx.lifecycle.LiveData<java.util.List<the.app.ethiocinema.data.Cinema>> getCinema();
    
    @androidx.room.Query(value = "Delete from Cinema ")
    public abstract void clear();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "select * from Cinema where name=:name")
    public abstract androidx.lifecycle.LiveData<the.app.ethiocinema.data.Cinema> getInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String name);
}