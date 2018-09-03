package microservice.book.multiplication.service.employee.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import microservice.book.multiplication.models.Employee;
import microservice.book.multiplication.repository.EmployeeRepository;
import microservice.book.multiplication.service.employee.EmployeeService;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

	@PersistenceContext
	private EntityManager em;
	
	@Autowired
	@Qualifier("employeeRepository")
	private EmployeeRepository employeeService;
	
	/*@Override
	public List<Employee> allEmployees() {
		return employeeService.findAll();
	}*/

	@Override
	public List<Employee> allEmployees() {
		return (List<Employee>) em.createQuery("from Employee").getResultList();
	}	
	
}
