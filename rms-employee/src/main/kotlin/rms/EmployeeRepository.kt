package rms

import org.springframework.data.repository.CrudRepository

interface EmployeeRepository : CrudRepository<EmployeeEntity,Long> {

	fun findByName(name: String): List<EmployeeEntity>
}