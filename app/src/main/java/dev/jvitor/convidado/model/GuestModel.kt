package dev.jvitor.convidado.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = DataBaseConstants.TABLE_NAME)
class GuestModel {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = DataBaseConstants.ID)
    var id: Int = 0

    @ColumnInfo(name = DataBaseConstants.NAME)
    var name: String = ""

    @ColumnInfo(name = DataBaseConstants.PRESENCE)
    var presence: Boolean = false
}