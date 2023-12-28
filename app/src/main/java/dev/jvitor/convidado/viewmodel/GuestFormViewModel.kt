package dev.jvitor.convidado.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import dev.jvitor.convidado.model.GuestModel
import dev.jvitor.convidado.repository.GuestRepository

class GuestFormViewModel(application: Application) : AndroidViewModel(application) {

    private val repository = GuestRepository(application)

    private val guestModel = MutableLiveData<GuestModel>()
    val guest: LiveData<GuestModel> = guestModel

    private val _saveGuest = MutableLiveData<String>()
    val saveGuest: LiveData<String> = _saveGuest

    fun get(id: Int){
       guestModel.value = repository.get(id)
    }

    fun save(guest: GuestModel) {
        if (guest.name.isNotBlank()) {
            if (guest.id == 0)
                if (repository.insert(guest))
                    _saveGuest.value = getMessage(guest.id)
                else
                    _saveGuest.value = messageFail()
            else
                if (repository.update(guest))
                    _saveGuest.value = getMessage(guest.id)
                else
                    _saveGuest.value = messageFail()
        } else {
            _saveGuest.value = messageFailNameIsBlank()
        }
    }

    private fun getMessage(id: Int) : String {
        return if (id == 0) "Cadastrado com sucesso." else "Atualizado com sucesso."
    }

    private fun messageFail() : String {
        return "FALHA!"
    }

    private fun messageFailNameIsBlank() : String {
        return "FALHA! Insira o nome do convidado."
    }
}