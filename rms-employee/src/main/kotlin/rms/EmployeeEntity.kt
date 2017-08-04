package rms

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "T_EMPLOYEE")
data class EmployeeEntity (
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	val id: Long? = 0,
	var name: String = "",
	var description: String = ""
)