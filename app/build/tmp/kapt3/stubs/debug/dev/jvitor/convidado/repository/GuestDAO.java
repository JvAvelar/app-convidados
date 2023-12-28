package dev.jvitor.convidado.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\'J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\nH\'J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\u0006\u0010\f\u001a\u00020\bH\'J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u0010"}, d2 = {"Ldev/jvitor/convidado/repository/GuestDAO;", "", "delete", "", "guest", "Ldev/jvitor/convidado/model/GuestModel;", "get", "id", "", "getAll", "", "getPresentOrAbsent", "filter", "insert", "", "update", "app_debug"})
@androidx.room.Dao
public abstract interface GuestDAO {
    
    @androidx.room.Insert
    public abstract long insert(@org.jetbrains.annotations.NotNull
    dev.jvitor.convidado.model.GuestModel guest);
    
    @androidx.room.Update
    public abstract int update(@org.jetbrains.annotations.NotNull
    dev.jvitor.convidado.model.GuestModel guest);
    
    @androidx.room.Delete
    public abstract void delete(@org.jetbrains.annotations.NotNull
    dev.jvitor.convidado.model.GuestModel guest);
    
    @androidx.room.Query(value = "SELECT * FROM Guest WHERE id = :id")
    @org.jetbrains.annotations.NotNull
    public abstract dev.jvitor.convidado.model.GuestModel get(int id);
    
    @androidx.room.Query(value = "SELECT * FROM Guest")
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<dev.jvitor.convidado.model.GuestModel> getAll();
    
    @androidx.room.Query(value = "SELECT * FROM Guest WHERE presence = :filter")
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<dev.jvitor.convidado.model.GuestModel> getPresentOrAbsent(int filter);
}