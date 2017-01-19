package bidirectionnel.oneToOne;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: I
 *
 */
@Entity

public class I implements Serializable {

	   
	@Id
	private int id;
	private static final long serialVersionUID = 1L;
	
	
	@OneToOne
	private J j;

	public I() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public J getJ() {
		return j;
	}
	public void setJ(J j) {
		this.j = j;
	}
   
}
