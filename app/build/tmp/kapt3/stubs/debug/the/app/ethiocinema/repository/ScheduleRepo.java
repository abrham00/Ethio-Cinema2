package the.app.ethiocinema.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\u000eJ\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00110\u0010J\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00110\u0013R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lthe/app/ethiocinema/repository/ScheduleRepo;", "", "scdao", "Lthe/app/ethiocinema/data/ScheduleDao;", "(Lthe/app/ethiocinema/data/ScheduleDao;)V", "api", "Lthe/app/ethiocinema/net/netService;", "getApi", "()Lthe/app/ethiocinema/net/netService;", "Save", "", "sc", "Lthe/app/ethiocinema/data/Schedule;", "clear", "", "getSC", "Landroidx/lifecycle/LiveData;", "", "getScheduleFromNet", "Lretrofit2/Call;", "app_debug"})
public final class ScheduleRepo {
    @org.jetbrains.annotations.NotNull()
    private final the.app.ethiocinema.net.netService api = null;
    private final the.app.ethiocinema.data.ScheduleDao scdao = null;
    
    @org.jetbrains.annotations.NotNull()
    public final the.app.ethiocinema.net.netService getApi() {
        return null;
    }
    
    public final long Save(@org.jetbrains.annotations.NotNull()
    the.app.ethiocinema.data.Schedule sc) {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<the.app.ethiocinema.data.Schedule>> getSC() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Call<java.util.List<the.app.ethiocinema.data.Schedule>> getScheduleFromNet() {
        return null;
    }
    
    public final void clear() {
    }
    
    public ScheduleRepo(@org.jetbrains.annotations.NotNull()
    the.app.ethiocinema.data.ScheduleDao scdao) {
        super();
    }
}