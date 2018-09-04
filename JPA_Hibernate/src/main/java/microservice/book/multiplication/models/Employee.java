package microservice.book.multiplication.models;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Employee implements Serializable {

	private static final long serialVersionUID = -127190471164877439L;

	@Id
	private long code;

	private String name;

	private String lastname;

	private LocalDate birthdate;

	@OneToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name = "id_address")
	private Address address;
	
	public Employee(long code, String name, String lastname, LocalDate birthdate) {
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

	public LocalDate getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [code=" + code + ", name=" + name + ", lastname=" + lastname + ", birthdate=" + birthdate
				+ ", address=" + address.toString() + "]";
	}

		
}
