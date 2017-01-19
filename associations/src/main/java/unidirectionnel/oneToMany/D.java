package unidirectionnel.oneToMany;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: D
 *
 */
@Entity

public class D implements Serializable {

	   
	@Id
	private int id;
	private static final long serialVersionUID = 1L;

	public D() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}
   
}
