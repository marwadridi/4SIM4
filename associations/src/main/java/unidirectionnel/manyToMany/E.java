package unidirectionnel.manyToMany;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: E
 *
 */
@Entity

public class E implements Serializable {

	   
	@Id
	private int id;
	private static final long serialVersionUID = 1L;
	
	@ManyToMany
	private List<F> listDeF;

	public E() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public List<F> getListDeF() {
		return listDeF;
	}
	public void setListDeF(List<F> listDeF) {
		this.listDeF = listDeF;
	}
   
}
