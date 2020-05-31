package defazio.tutorials.demo.entities;

import javax.persistence.*;



import java.util.HashSet;
import java.util.Set;
@Entity
public class Autore extends Persona{

   
	public Autore(String nome,String cognome) {
		super(nome,cognome);
	}
	
	
	public Autore() {
		super();
	}

	private static final long serialVersionUID = 1L;
	
    @ManyToMany(mappedBy = "autori")
    private Set<Libro> libri=new HashSet<>();

    public Set<Libro> getLibri() {
        return libri;
    }

    public void setLibri(Set<Libro> books) {
        this.libri = books;
    }

	@Override
	public String toString() {
		return "Autore [libri=" + libri + ", nome=" + nome + ", cognome=" + cognome + ", id=" + id + "]";
	}

  
}
