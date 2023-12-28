package dev.jvitor.convidado.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import dev.jvitor.convidado.model.GuestModel
import dev.jvitor.convidado.repository.GuestRepository

class GuestsViewModel(application: Application) : AndroidViewModel(application) {

    private val repository = GuestRepository(application.applicationContext)

    private val listAllGuests = MutableLiveData<List<GuestModel>>()
    val guests: LiveData<List<GuestModel>> = listAllGuests


    fun getAll() {
        listAllGuests.value = repository.getAll()
    }

    fun delete(id: Int) {
        repository.delete(id)
    }

    fun getAbsent() {
        listAllGuests.value = repository.getPresentOrAbsent(0)
    }

    fun getPresent() {
        listAllGuests.value = repository.getPresentOrAbsent(1)
    }


}