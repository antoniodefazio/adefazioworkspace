package defazio.tutorials.demo.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;




@Entity


public class Customer extends Persona{
	 
/**
	 * 
	 */
	private static final long serialVersionUID = -2939366392865561946L;
private String indirizzo;

public String getIndirizzo() {
	return indirizzo;
}
public void setIndirizzo(String indirizzo) {
	this.indirizzo = indirizzo;
}
@Override
public String toString() {
	return "Customer [indirizzo=" + indirizzo + ", nome=" + nome + ", cognome=" + cognome + ", id=" + id + "]";
}


}
