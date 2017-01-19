package bidirectionnel.oneToOne;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: J
 *
 */
@Entity

public class J implements Serializable {

	   
	@Id
	private int id;
	private static final long serialVersionUID = 1L;
	
	@OneToOne(mappedBy="j")
	private I i ;
	

	public J() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public I getI() {
		return i;
	}
	public void setI(I i) {
		this.i = i;
	}
   
}
