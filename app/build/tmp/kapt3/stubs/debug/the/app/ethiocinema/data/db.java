package the.app.ethiocinema.data;

import java.lang.System;

@androidx.room.Database(entities = {the.app.ethiocinema.data.Movie.class, the.app.ethiocinema.data.Cinema.class, the.app.ethiocinema.data.Schedule.class}, version = 8)
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\n"}, d2 = {"Lthe/app/ethiocinema/data/db;", "Landroidx/room/RoomDatabase;", "()V", "cinemaDao", "Lthe/app/ethiocinema/data/CinemaDao;", "movieDao", "Lthe/app/ethiocinema/data/MovieDao;", "scheduleDao", "Lthe/app/ethiocinema/data/ScheduleDao;", "Companion", "app_debug"})
public abstract class db extends androidx.room.RoomDatabase {
    private static volatile the.app.ethiocinema.data.db INSTANCE;
    public static final the.app.ethiocinema.data.db.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract the.app.ethiocinema.data.MovieDao movieDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract the.app.ethiocinema.data.ScheduleDao scheduleDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract the.app.ethiocinema.data.CinemaDao cinemaDao();
    
    public db() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lthe/app/ethiocinema/data/db$Companion;", "", "()V", "INSTANCE", "Lthe/app/ethiocinema/data/db;", "getDatabase", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final the.app.ethiocinema.data.db getDatabase(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}