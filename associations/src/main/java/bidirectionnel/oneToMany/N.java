package bidirectionnel.oneToMany;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: N
 *
 */
@Entity

public class N implements Serializable {

	   
	@Id
	private int id;
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	private M m;

	public N() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public M getM() {
		return m;
	}
	public void setM(M m) {
		this.m = m;
	}
   
}
