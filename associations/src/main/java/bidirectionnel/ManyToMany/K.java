package bidirectionnel.ManyToMany;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: K
 *
 */
@Entity

public class K implements Serializable {

	   
	@Id
	private int id;
	private static final long serialVersionUID = 1L;
	
	@ManyToMany
	private List<L> listDeL;

	public K() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public List<L> getListDeL() {
		return listDeL;
	}
	public void setListDeL(List<L> listDeL) {
		this.listDeL = listDeL;
	}
   
}
