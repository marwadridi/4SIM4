package unidirectionnel.manyToMany;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: F
 *
 */
@Entity

public class F implements Serializable {

	   
	@Id
	private int id;
	private static final long serialVersionUID = 1L;

	public F() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}
   
}
