package microservice.book.multiplication.controller;

import java.time.LocalDate;
import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import microservice.book.multiplication.models.Employee;
import microservice.book.multiplication.models.Address;
import microservice.book.multiplication.service.employee.EmployeeService;

@RestController
public class ManagerController {

	@Autowired
	@Qualifier("employeeService")
	private EmployeeService employeeService;

	@GetMapping("/employees")
	public List<Employee> getEmployees() {

		return employeeService.allEmployees();
	}

	@GetMapping("/employee/save")
	public Employee createEmployee() {
		
	Address address = new Address(20L, "Calle Falsa", "Antq", "Medellin", "CO");
	
		Employee employee = new Employee
				(2L, "Carola", "Ballesteros", LocalDate.of(1993,11,28));
	
		employee.setAddress(address);
		
		employeeService.createEmployee(employee);
		
		return employee;
	}
}
