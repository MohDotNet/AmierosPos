package com.amieros.amierospos.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.amieros.amierospos.data.entities.Departments
import com.amieros.amierospos.data.interfaces.IDepartmentsDao

@Database(
    entities = [Departments::class],
    version = 1
)
abstract class PosDatabase : RoomDatabase() {
    abstract val departmentDao : IDepartmentsDao
}