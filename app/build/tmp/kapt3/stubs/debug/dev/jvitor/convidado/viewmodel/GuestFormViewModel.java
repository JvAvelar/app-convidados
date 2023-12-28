package dev.jvitor.convidado.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u0010\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0017\u001a\u00020\u0007H\u0002J\b\u0010\u0018\u001a\u00020\u0007H\u0002J\u000e\u0010\u0019\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\nR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f\u00a8\u0006\u001a"}, d2 = {"Ldev/jvitor/convidado/viewmodel/GuestFormViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "_saveGuest", "Landroidx/lifecycle/MutableLiveData;", "", "guest", "Landroidx/lifecycle/LiveData;", "Ldev/jvitor/convidado/model/GuestModel;", "getGuest", "()Landroidx/lifecycle/LiveData;", "guestModel", "repository", "Ldev/jvitor/convidado/repository/GuestRepository;", "saveGuest", "getSaveGuest", "get", "", "id", "", "getMessage", "messageFail", "messageFailNameIsBlank", "save", "app_debug"})
public final class GuestFormViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull
    private final dev.jvitor.convidado.repository.GuestRepository repository = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<dev.jvitor.convidado.model.GuestModel> guestModel = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<dev.jvitor.convidado.model.GuestModel> guest = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _saveGuest = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.lang.String> saveGuest = null;
    
    public GuestFormViewModel(@org.jetbrains.annotations.NotNull
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<dev.jvitor.convidado.model.GuestModel> getGuest() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.String> getSaveGuest() {
        return null;
    }
    
    public final void get(int id) {
    }
    
    public final void save(@org.jetbrains.annotations.NotNull
    dev.jvitor.convidado.model.GuestModel guest) {
    }
    
    private final java.lang.String getMessage(int id) {
        return null;
    }
    
    private final java.lang.String messageFail() {
        return null;
    }
    
    private final java.lang.String messageFailNameIsBlank() {
        return null;
    }
}