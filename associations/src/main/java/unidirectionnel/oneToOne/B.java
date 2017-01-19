package unidirectionnel.oneToOne;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: B
 *
 */
@Entity

public class B implements Serializable {

	   
	@Id
	private int id;
	private static final long serialVersionUID = 1L;

	public B() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}
   
}
