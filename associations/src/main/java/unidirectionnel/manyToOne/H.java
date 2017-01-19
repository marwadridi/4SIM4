package unidirectionnel.manyToOne;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: H
 *
 */
@Entity

public class H implements Serializable {

	   
	@Id
	private int id;
	private static final long serialVersionUID = 1L;

	public H() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}
   
}
