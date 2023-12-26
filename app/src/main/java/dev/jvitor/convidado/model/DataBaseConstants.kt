package dev.jvitor.convidado.model

class DataBaseConstants private constructor(){
    companion object {

        const val TABLE_NAME = "Guest"
        const val ID = "id"
        const val NAME = "name"
        const val PRESENCE = "presence"

        const val CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + " (" +
                ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                NAME + " TEXT, " +
                PRESENCE + " INTEGER);"

        const val GUEST_ID = "guestid"
    }
}