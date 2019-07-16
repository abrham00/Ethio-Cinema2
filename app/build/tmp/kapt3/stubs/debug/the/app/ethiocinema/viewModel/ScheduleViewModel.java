package the.app.ethiocinema.viewModel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R&\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lthe/app/ethiocinema/viewModel/ScheduleViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "allSchedule", "Landroidx/lifecycle/LiveData;", "", "Lthe/app/ethiocinema/data/Schedule;", "getAllSchedule", "()Landroidx/lifecycle/LiveData;", "setAllSchedule", "(Landroidx/lifecycle/LiveData;)V", "scRepo", "Lthe/app/ethiocinema/repository/ScheduleRepo;", "app_debug"})
public final class ScheduleViewModel extends androidx.lifecycle.AndroidViewModel {
    private final the.app.ethiocinema.repository.ScheduleRepo scRepo = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<java.util.List<the.app.ethiocinema.data.Schedule>> allSchedule;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<the.app.ethiocinema.data.Schedule>> getAllSchedule() {
        return null;
    }
    
    public final void setAllSchedule(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.util.List<the.app.ethiocinema.data.Schedule>> p0) {
    }
    
    public ScheduleViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}