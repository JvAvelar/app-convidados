package dev.jvitor.convidado.repository

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import dev.jvitor.convidado.model.DataBaseConstants

// Fornece a conexão com o Banco de Dados
class GuestDataBase(context: Context) : SQLiteOpenHelper(context, NAME, null, VERSION) {

    companion object {
        private const val NAME = "guestdb"
        private const val VERSION = 1
    }
    override fun onCreate(db: SQLiteDatabase) {
        db.execSQL(DataBaseConstants.CREATE_TABLE)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {

    }
}