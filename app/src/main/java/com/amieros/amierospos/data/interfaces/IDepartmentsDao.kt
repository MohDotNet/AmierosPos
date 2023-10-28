package com.amieros.amierospos.data.interfaces

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.amieros.amierospos.data.entities.Departments
import kotlinx.coroutines.flow.Flow


/* the doa object is a list of fucntions that we wish to perform on the table.

 */

@Dao
interface IDepartmentsDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun InsertDepartment(departmnet : Departments)

    @Query("Update Departments set isDisabled = true where id = :id")
    suspend fun DisableDepartment(id : Int) : Boolean

    @Query("SELECT * FROM Departments")
    suspend fun getDepartments() : Flow<List<Departments>>

}