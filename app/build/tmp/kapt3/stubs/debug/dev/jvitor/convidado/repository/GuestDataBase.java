package dev.jvitor.convidado.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Ldev/jvitor/convidado/repository/GuestDataBase;", "Landroidx/room/RoomDatabase;", "()V", "guestDAO", "Ldev/jvitor/convidado/repository/GuestDAO;", "Companion", "app_debug"})
@androidx.room.Database(entities = {dev.jvitor.convidado.model.GuestModel.class}, version = 1)
public abstract class GuestDataBase extends androidx.room.RoomDatabase {
    private static dev.jvitor.convidado.repository.GuestDataBase INSTANCE;
    @org.jetbrains.annotations.NotNull
    private static final androidx.room.migration.Migration MIGRATION_1_2 = null;
    @org.jetbrains.annotations.NotNull
    public static final dev.jvitor.convidado.repository.GuestDataBase.Companion Companion = null;
    
    public GuestDataBase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract dev.jvitor.convidado.repository.GuestDAO guestDAO();
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Ldev/jvitor/convidado/repository/GuestDataBase$Companion;", "", "()V", "INSTANCE", "Ldev/jvitor/convidado/repository/GuestDataBase;", "MIGRATION_1_2", "Landroidx/room/migration/Migration;", "getDataBase", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @kotlin.OptIn(markerClass = {kotlinx.coroutines.InternalCoroutinesApi.class})
        @org.jetbrains.annotations.NotNull
        public final dev.jvitor.convidado.repository.GuestDataBase getDataBase(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
            return null;
        }
    }
}