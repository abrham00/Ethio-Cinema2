package the.app.ethiocinema.net;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \n2\u00020\u0001:\u0001\nJ\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\'J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u0003H\'J\u0014\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00040\u0003H\'\u00a8\u0006\u000b"}, d2 = {"Lthe/app/ethiocinema/net/netService;", "", "getAllMoviesFromNet", "Lretrofit2/Call;", "", "Lthe/app/ethiocinema/data/Movie;", "getCinemas", "Lthe/app/ethiocinema/data/Cinema;", "getSchedule", "Lthe/app/ethiocinema/data/Schedule;", "Companion", "app_debug"})
public abstract interface netService {
    public static final the.app.ethiocinema.net.netService.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "movies")
    public abstract retrofit2.Call<java.util.List<the.app.ethiocinema.data.Movie>> getAllMoviesFromNet();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "schedule")
    public abstract retrofit2.Call<java.util.List<the.app.ethiocinema.data.Schedule>> getSchedule();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "cinemas")
    public abstract retrofit2.Call<java.util.List<the.app.ethiocinema.data.Cinema>> getCinemas();
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lthe/app/ethiocinema/net/netService$Companion;", "", "()V", "baseUrl", "", "getInstance", "Lthe/app/ethiocinema/net/netService;", "app_debug"})
    public static final class Companion {
        private static final java.lang.String baseUrl = "http://192.168.43.36:88/controller/";
        
        @org.jetbrains.annotations.NotNull()
        public final the.app.ethiocinema.net.netService getInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}