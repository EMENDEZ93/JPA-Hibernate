package microservice.book.multiplication.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Book {

	@Id
	private long id;
	
	private String title;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="author_id")
	private Author author;
	
}
