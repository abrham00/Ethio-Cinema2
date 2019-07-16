package the.app.ethiocinema;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u001b\u0010\u0013\u001a\u00020\u000e2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0000\u00a2\u0006\u0002\b\u0014R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0016"}, d2 = {"Lthe/app/ethiocinema/CinemaAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lthe/app/ethiocinema/CinemaAdapter$CinemaViewHolder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "cinemaL", "", "Lthe/app/ethiocinema/data/Cinema;", "getContext", "()Landroid/content/Context;", "getItemCount", "", "onBindViewHolder", "", "p0", "p1", "onCreateViewHolder", "Landroid/view/ViewGroup;", "setCinemaList", "setCinemaList$app_debug", "CinemaViewHolder", "app_debug"})
public final class CinemaAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<the.app.ethiocinema.CinemaAdapter.CinemaViewHolder> {
    private java.util.List<the.app.ethiocinema.data.Cinema> cinemaL;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    
    public final void setCinemaList$app_debug(@org.jetbrains.annotations.NotNull()
    java.util.List<the.app.ethiocinema.data.Cinema> cinemaL) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public the.app.ethiocinema.CinemaAdapter.CinemaViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup p0, int p1) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    the.app.ethiocinema.CinemaAdapter.CinemaViewHolder p0, int p1) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public CinemaAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lthe/app/ethiocinema/CinemaAdapter$CinemaViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "app_debug"})
    public static final class CinemaViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public CinemaViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}