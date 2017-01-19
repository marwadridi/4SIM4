package unidirectionnel.oneToMany;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: C
 *
 */
@Entity

public class C implements Serializable {

	   
	@Id
	private int id;
	private static final long serialVersionUID = 1L;
	
	@OneToMany
	private List<D> ds;

	public C() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public List<D> getDs() {
		return ds;
	}
	public void setDs(List<D> ds) {
		this.ds = ds;
	}
   
}
