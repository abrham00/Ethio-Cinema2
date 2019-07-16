package the.app.ethiocinema.data;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u0014\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005H\'J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007H\'\u00a8\u0006\u000b"}, d2 = {"Lthe/app/ethiocinema/data/ScheduleDao;", "", "clear", "", "getSc", "Landroidx/lifecycle/LiveData;", "", "Lthe/app/ethiocinema/data/Schedule;", "insertSc", "", "sc", "app_debug"})
public abstract interface ScheduleDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract long insertSc(@org.jetbrains.annotations.NotNull()
    the.app.ethiocinema.data.Schedule sc);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "Select * from Schedule")
    public abstract androidx.lifecycle.LiveData<java.util.List<the.app.ethiocinema.data.Schedule>> getSc();
    
    @androidx.room.Query(value = "Delete from schedule")
    public abstract void clear();
}