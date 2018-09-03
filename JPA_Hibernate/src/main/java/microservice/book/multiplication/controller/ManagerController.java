package microservice.book.multiplication.controller;

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
		Employee employee = new Employee
				(2L, "Carola", "Ballesteros", new GregorianCalendar(1993,11,28).getTime());
		return employeeService.createEmployee(employee);
	}
}
