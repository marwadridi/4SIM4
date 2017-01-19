package unidirectionnel.manyToOne;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: G
 *
 */
@Entity

public class G implements Serializable {

	   
	@Id
	private int id;
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	private H h;

	public G() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public H getH() {
		return h;
	}
	public void setH(H h) {
		this.h = h;
	}
   
}
