package defazio.tutorials.demo.dto;

public class LibroDto {

    private String titolo;
    private String isbn;
    private String casaEditrice;
    public LibroDto(){}
    public LibroDto(String titolo, String isbn, String casaEditrice) {
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
}
