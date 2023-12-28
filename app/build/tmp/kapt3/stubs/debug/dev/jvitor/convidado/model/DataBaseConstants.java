package dev.jvitor.convidado.model;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Ldev/jvitor/convidado/model/DataBaseConstants;", "", "()V", "Companion", "app_debug"})
public final class DataBaseConstants {
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String TABLE_NAME = "Guest";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String ID = "id";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String NAME = "name";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String PRESENCE = "presence";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String CREATE_TABLE = "CREATE TABLE Guest (id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT, presence INTEGER);";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String GUEST_ID = "guestid";
    @org.jetbrains.annotations.NotNull
    public static final dev.jvitor.convidado.model.DataBaseConstants.Companion Companion = null;
    
    private DataBaseConstants() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Ldev/jvitor/convidado/model/DataBaseConstants$Companion;", "", "()V", "CREATE_TABLE", "", "GUEST_ID", "ID", "NAME", "PRESENCE", "TABLE_NAME", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}