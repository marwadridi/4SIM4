package bidirectionnel.ManyToMany;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: L
 *
 */
@Entity

public class L implements Serializable {

	   
	@Id
	private int id;
	private static final long serialVersionUID = 1L;
	
	@ManyToMany(mappedBy="listDeL")
	private List<K> listDeK;

	public L() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public List<K> getListDeK() {
		return listDeK;
	}
	public void setListDeK(List<K> listDeK) {
		this.listDeK = listDeK;
	}
   
}
