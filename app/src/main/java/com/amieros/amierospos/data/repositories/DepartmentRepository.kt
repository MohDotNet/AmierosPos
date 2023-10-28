package com.amieros.amierospos.data.repositories

import com.amieros.amierospos.data.entities.Departments
import com.amieros.amierospos.data.interfaces.IDepartmentRepository
import com.amieros.amierospos.data.interfaces.IDepartmentsDao
import kotlinx.coroutines.flow.Flow

class DepartmentRepository(
    private val departmentDao : IDepartmentsDao
) : IDepartmentRepository {

    override suspend fun InsertDepartment(departmnet: Departments) {
        departmentDao.InsertDepartment(departmnet)
    }

    override suspend fun DisableDepartment(id: Int): Boolean {
        var result = departmentDao.DisableDepartment(id)

        if (result) return true
        else return false
    }

    override suspend fun getDepartments(): Flow<List<Departments>> {
        return departmentDao.getDepartments()
    }

}