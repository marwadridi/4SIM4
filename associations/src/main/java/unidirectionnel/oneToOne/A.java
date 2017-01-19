package unidirectionnel.oneToOne;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: A
 *
 */
@Entity

public class A implements Serializable {

	   
	@Id
	private int id;
	private static final long serialVersionUID = 1L;
	
	@OneToOne
	private B b;

	public A() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public B getB() {
		return b;
	}
	public void setB(B b) {
		this.b = b;
	}
   
}
