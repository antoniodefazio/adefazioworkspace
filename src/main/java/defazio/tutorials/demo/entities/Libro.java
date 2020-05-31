package defazio.tutorials.demo.entities;

import javax.persistence.*;



import java.util.HashSet;
import java.util.Set;
@Entity
public class Libro extends BaseEntityLongId{

    
	public Libro() {
		super();
	}
    

 public Libro(String titolo, String isbn, String casaEditrice) {
		super();
		this.titolo = titolo;
		this.isbn = isbn;
		this.casaEditrice = casaEditrice;
	}


	private static final long serialVersionUID = 1L;
	private String titolo;
    private String isbn;
    private String casaEditrice;
    @ManyToMany
    @JoinTable(name="autore_libri", joinColumns=@JoinColumn(name="libri_id"),
    inverseJoinColumns = @JoinColumn(name="autore_id"))
    private Set<Autore> autori=new HashSet<>();
   



public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getCasaEditrice() {
        return casaEditrice;
    }

    public void setCasaEditrice(String casaEditrice) {
        this.casaEditrice = casaEditrice;
    }

    public Set<Autore> getAutori() {
        return autori;
    }

    public void setAutori(Set<Autore> autori) {
        this.autori = autori;
    }

 

    @Override
    public String toString() {
        return "Libro{" +
                "titolo='" + titolo + '\'' +
                ", isbn='" + isbn + '\'' +
                ", casaEditrice='" + casaEditrice + '\'' +
                ", autori=" + autori +
                ", id=" + id +
                '}';
    }
}
