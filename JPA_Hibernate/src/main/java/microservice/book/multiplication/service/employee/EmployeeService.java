package microservice.book.multiplication.service.employee;

import java.util.List;

import microservice.book.multiplication.models.Employee;

public interface EmployeeService {

	public List<Employee> allEmployees();
	
	public Employee createEmployee(Employee employee);
	
}
