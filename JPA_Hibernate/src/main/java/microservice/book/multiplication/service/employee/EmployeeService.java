package microservice.book.multiplication.service.employee;

import java.util.List;

import microservice.book.multiplication.models.Address;
import microservice.book.multiplication.models.Employee;

public interface EmployeeService {

	public List<Employee> allEmployees();
	
	public Employee createEmployee(Employee employee);

	public void createAddress(Address address);
	
}
