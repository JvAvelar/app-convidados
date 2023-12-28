package dev.jvitor.convidado.repository

import android.annotation.SuppressLint
import android.content.Context
import dev.jvitor.convidado.model.GuestModel

class GuestRepository(context: Context) {

    private val guestDataBase = GuestDataBase.getDataBase(context).guestDAO()

    fun insert(guest: GuestModel): Boolean {
        return guestDataBase.insert(guest) > 0
    }

    fun update(guest: GuestModel): Boolean {
        return guestDataBase.update(guest) > 0
    }

    fun delete(id: Int) {
        val guest = get(id)
        guestDataBase.delete(guest)
    }

    fun get(id: Int): GuestModel {
        return guestDataBase.get(id)
    }

    @SuppressLint("Range")
    fun getAll(): List<GuestModel> {
        return guestDataBase.getAll()
    }

    @SuppressLint("Range")
    fun getPresentOrAbsent(filter: Int): List<GuestModel> {
        return guestDataBase.getPresentOrAbsent(filter)
    }
}