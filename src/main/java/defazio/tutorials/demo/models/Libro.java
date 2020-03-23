package defazio.tutorials.demo.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
@Entity
public class Libro {

    private String titolo;
    private String isbn;
    private String casaEditrice;
    @ManyToMany
    @JoinTable(name="autore_libri", joinColumns=@JoinColumn(name="libri_id"),
    inverseJoinColumns = @JoinColumn(name="autore_id"))
    private Set<Autore> autori=new HashSet<>();
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return Objects.equals(id, libro.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Libro(){}
    public Libro(String titolo, String isbn, String casaEditrice) {
        this.titolo = titolo;
        this.isbn = isbn;
        this.casaEditrice = casaEditrice;
    }

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

    public Libro(String titolo, String isbn, String casaEditrice, Set<Autore> autori) {
        this.titolo = titolo;
        this.isbn = isbn;
        this.casaEditrice = casaEditrice;
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
