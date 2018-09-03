package microservice.book.multiplication.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Employee implements Serializable {

	private static final long serialVersionUID = -127190471164877439L;

	@Id
	private long code;

	private String name;

	private String lastname;

	private Date birthdate;

	public Employee(long code, String name, String lastname, Date birthdate) {
		super();
		this.code = code;
		this.name = name;
		this.lastname = lastname;
		this.birthdate = birthdate;
	}

	public Employee() {
	}

	public long getCode() {
		return code;
	}

	public void setCode(long code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

}
