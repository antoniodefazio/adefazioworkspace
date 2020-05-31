package defazio.tutorials.demo.entities;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
@Entity
public class Magazzino extends BaseEntityLongId{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1067513895289568230L;

	@OneToOne
	private Libro libro;
	
	private String indirizzoMagazzino;

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	public String getIndirizzoMagazzino() {
		return indirizzoMagazzino;
	}

	public void setIndirizzoMagazzino(String indirizzoMagazzino) {
		this.indirizzoMagazzino = indirizzoMagazzino;
	}

	@Override
	public String toString() {
		return "Magazzino [libro=" + libro + ", indirizzoMagazzino=" + indirizzoMagazzino + ", id=" + id + "]";
	}
	
	

}
