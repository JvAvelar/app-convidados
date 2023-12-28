package dev.jvitor.convidado.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000eH\u0007J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000e2\u0006\u0010\u0010\u001a\u00020\nH\u0007J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\fJ\u000e\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Ldev/jvitor/convidado/repository/GuestRepository;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "guestDataBase", "Ldev/jvitor/convidado/repository/GuestDAO;", "delete", "", "id", "", "get", "Ldev/jvitor/convidado/model/GuestModel;", "getAll", "", "getPresentOrAbsent", "filter", "insert", "", "guest", "update", "app_debug"})
public final class GuestRepository {
    @org.jetbrains.annotations.NotNull
    private final dev.jvitor.convidado.repository.GuestDAO guestDataBase = null;
    
    public GuestRepository(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super();
    }
    
    public final boolean insert(@org.jetbrains.annotations.NotNull
    dev.jvitor.convidado.model.GuestModel guest) {
        return false;
    }
    
    public final boolean update(@org.jetbrains.annotations.NotNull
    dev.jvitor.convidado.model.GuestModel guest) {
        return false;
    }
    
    public final void delete(int id) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final dev.jvitor.convidado.model.GuestModel get(int id) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"Range"})
    @org.jetbrains.annotations.NotNull
    public final java.util.List<dev.jvitor.convidado.model.GuestModel> getAll() {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"Range"})
    @org.jetbrains.annotations.NotNull
    public final java.util.List<dev.jvitor.convidado.model.GuestModel> getPresentOrAbsent(int filter) {
        return null;
    }
}