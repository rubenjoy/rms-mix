package rms

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value = "/employees")
class EmployeeController {

	@ResponseStatus(value = HttpStatus.NOT_FOUND,
		reason = "Employee not found.")
	private class NotFoundException(): RuntimeException()

	@Autowired
	private lateinit var repository: EmployeeRepository

	@RequestMapping(method = arrayOf(RequestMethod.GET))
	fun getEmployees() = repository.findAll()

	@RequestMapping(method = arrayOf(RequestMethod.GET),
		value = "/{id}")
	fun getEmployeeById(@PathVariable id: Long): EmployeeEntity?
		= repository.findOne(id)

	@RequestMapping(method = arrayOf(RequestMethod.POST))
	fun postEmployee(@RequestBody employee: EmployeeEntity)
		= repository.save(employee)
}