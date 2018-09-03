package microservice.book.multiplication.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import microservice.book.multiplication.models.Employee;

@Repository("employeeRepository")
public interface EmployeeRepository extends JpaRepository<Employee, Serializable>{

}
