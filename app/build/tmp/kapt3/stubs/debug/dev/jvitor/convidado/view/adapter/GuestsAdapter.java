package dev.jvitor.convidado.view.adapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bJ\b\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\rH\u0016J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\rH\u0016J\u0016\u0010\u0015\u001a\u00020\n2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Ldev/jvitor/convidado/view/adapter/GuestsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Ldev/jvitor/convidado/view/viewholder/GuestsViewHolder;", "()V", "guestList", "", "Ldev/jvitor/convidado/model/GuestModel;", "listener", "Ldev/jvitor/convidado/view/listener/OnGuestListener;", "attachListener", "", "guestListener", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updateGuests", "list", "app_debug"})
public final class GuestsAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<dev.jvitor.convidado.view.viewholder.GuestsViewHolder> {
    @org.jetbrains.annotations.NotNull
    private java.util.List<dev.jvitor.convidado.model.GuestModel> guestList;
    private dev.jvitor.convidado.view.listener.OnGuestListener listener;
    
    public GuestsAdapter() {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public dev.jvitor.convidado.view.viewholder.GuestsViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    dev.jvitor.convidado.view.viewholder.GuestsViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    public final void updateGuests(@org.jetbrains.annotations.NotNull
    java.util.List<dev.jvitor.convidado.model.GuestModel> list) {
    }
    
    public final void attachListener(@org.jetbrains.annotations.NotNull
    dev.jvitor.convidado.view.listener.OnGuestListener guestListener) {
    }
}