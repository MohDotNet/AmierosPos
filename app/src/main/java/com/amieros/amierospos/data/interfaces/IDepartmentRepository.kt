package com.amieros.amierospos.data.interfaces

import com.amieros.amierospos.data.entities.Departments
import kotlinx.coroutines.flow.Flow

interface IDepartmentRepository {


    suspend fun InsertDepartment(departmnet : Departments)
    suspend fun DisableDepartment(id : Int) : Boolean
    suspend fun getDepartments() : Flow<List<Departments>>

}