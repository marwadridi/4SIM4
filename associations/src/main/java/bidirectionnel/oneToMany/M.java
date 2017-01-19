package bidirectionnel.oneToMany;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: M
 *
 */
@Entity

public class M implements Serializable {


	@Id
	private int id;
	
	@OneToMany(mappedBy="m")
	private List<N> listDeN;
	
	private static final long serialVersionUID = 1L;

	public M() {
		super();
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<N> getListDeN() {
		return listDeN;
	}

	public void setListDeN(List<N> listDeN) {
		this.listDeN = listDeN;
	}

	
   
}
