package com.example.roomdbph42448

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Student")
data class StudentModel(
    @PrimaryKey(autoGenerate = true) var uid: Int = 0,
    @ColumnInfo(name = "hoten") var hoten: String?,
    @ColumnInfo(name = "mssv") var mssv: String?,
    @ColumnInfo(name = "diemTB") var diemTB: Float?,
    @ColumnInfo(name = "daratruong") var daratruong: Boolean?,
    @ColumnInfo(name = "photoPath") var photoPath: String? = null
)
