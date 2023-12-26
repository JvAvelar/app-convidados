package dev.jvitor.convidado.repository

import android.annotation.SuppressLint
import android.content.ContentValues
import android.content.Context
import dev.jvitor.convidado.model.DataBaseConstants
import dev.jvitor.convidado.model.GuestModel

// Manipula os dados obtidos e recebidos pela conexão com o Banco de Dados
// Lida com os dados
class GuestRepository private constructor(context: Context) {

    private val guestDataBase = GuestDataBase(context)

    // Singleton
    companion object {
        private lateinit var repository: GuestRepository
        fun getInstance(context: Context): GuestRepository {
            if (!Companion::repository.isInitialized) {
                repository = GuestRepository(context)
            }
            return repository
        }
    }

    fun insert(guest: GuestModel): Boolean {
        return try {
            val db = guestDataBase.writableDatabase
            val presence = if (guest.presence) 1 else 0
            val values = ContentValues()
            values.put(DataBaseConstants.NAME, guest.name)
            values.put(DataBaseConstants.PRESENCE, presence)
            db.insert(DataBaseConstants.TABLE_NAME, null, values)
            true
        } catch (e: Exception) {
            false
        }
    }

    fun update(guest: GuestModel): Boolean {
        return try {
            val db = guestDataBase.writableDatabase
            val presence = if (guest.presence) 1 else 0

            val values = ContentValues()
            values.put(DataBaseConstants.NAME, guest.name)
            values.put(DataBaseConstants.PRESENCE, presence)
            val selection = DataBaseConstants.ID + " = ?"
            val args = arrayOf(guest.id.toString())

            db.update(DataBaseConstants.TABLE_NAME, values, selection, args)
            true
        } catch (e: Exception) {
            false
        }
    }

    fun delete(id: Int): Boolean {
        return try {
            val db = guestDataBase.writableDatabase
            val selection = DataBaseConstants.ID + " = ?"
            val args = arrayOf(id.toString())
            db.delete(DataBaseConstants.TABLE_NAME, selection, args)
            true
        } catch (e: Exception) {
            false
        }
    }

    @SuppressLint("Range")
    fun getAll(): List<GuestModel> {
        val list = mutableListOf<GuestModel>()
        try {
            val db = guestDataBase.readableDatabase
            val projection = arrayOf(
                DataBaseConstants.ID,
                DataBaseConstants.NAME,
                DataBaseConstants.PRESENCE
            )

            val cursor = db.query(
                DataBaseConstants.TABLE_NAME, projection,
                null, null,
                null, null, null
            )

            if (cursor != null && cursor.count > 0) {
                while (cursor.moveToNext()) {
                    val id = cursor.getInt(cursor.getColumnIndex(DataBaseConstants.ID))
                    val name = cursor.getString(cursor.getColumnIndex(DataBaseConstants.NAME))
                    val presence = cursor.getInt(cursor.getColumnIndex(DataBaseConstants.PRESENCE))
                    list.add(GuestModel(id, name, presence == 1))
                }
            }
            cursor.close()
        } catch (e: Exception) {
            return list
        }
        return list
    }

    @SuppressLint("Range")
    fun getPresentOrAbsent(filter: Int): List<GuestModel> {
        val listPresence = mutableListOf<GuestModel>()
        try {
            val db = guestDataBase.readableDatabase

            val cursor = db.rawQuery(
                "SELECT * FROM " + DataBaseConstants.TABLE_NAME + " WHERE " +
                        DataBaseConstants.PRESENCE + " = " + filter, null
            )

            if (cursor != null && cursor.count > 0) {
                while (cursor.moveToNext()) {
                    val id = cursor.getInt(cursor.getColumnIndex(DataBaseConstants.ID))
                    val name = cursor.getString(cursor.getColumnIndex(DataBaseConstants.NAME))
                    val presence = cursor.getInt(cursor.getColumnIndex(DataBaseConstants.PRESENCE))

                    listPresence.add(GuestModel(id, name, presence == 1))
                }
            }
            cursor.close()
        } catch (e: Exception) {
            return listPresence
        }
        return listPresence
    }

    @SuppressLint("Range")
    fun get(id: Int) : GuestModel? {
        var guest: GuestModel? = null
        try {
            val db = guestDataBase.readableDatabase

            val projection = arrayOf(
                DataBaseConstants.ID,
                DataBaseConstants.NAME,
                DataBaseConstants.PRESENCE
            )

            val selection = DataBaseConstants.ID + " = ?"
            val args = arrayOf(id.toString())

            val cursor = db.query(
                DataBaseConstants.TABLE_NAME, projection,
                selection, args,
                null, null, null
            )

            if (cursor != null && cursor.count > 0) {
                while (cursor.moveToNext()) {
                    val name = cursor.getString(cursor.getColumnIndex(DataBaseConstants.NAME))
                    val presence = cursor.getInt(cursor.getColumnIndex(DataBaseConstants.PRESENCE))
                    guest = GuestModel(id, name, presence == 1)
                }
            }
            cursor.close()
        } catch (e: Exception) {
            return guest
        }
        return guest
    }



}