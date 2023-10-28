package com.amieros.amierospos.data.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Departments(

    @PrimaryKey
    @ColumnInfo(name = "Department_Id")
    val id : Int? = null,

    val DepartmentName : String,
    val isDisabled : Boolean
)
