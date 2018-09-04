package microservice.book.multiplication.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table
public class Address {

	@Id
	@Column(name = "id_address")
	private long id;

	private String address;

	private String location;

	private String distric;

	private String country;

	public Address(long id, String address, String location, String distric, String country) {
		this.id = id;
		this.address = address;
		this.location = location;
		this.distric = distric;
		this.country = country;
	}

	public Address() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDistric() {
		return distric;
	}

	public void setDistric(String distric) {
		this.distric = distric;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
		
}
