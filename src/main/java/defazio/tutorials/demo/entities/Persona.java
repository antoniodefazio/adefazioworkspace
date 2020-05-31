package defazio.tutorials.demo.entities;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Persona extends BaseEntityLongId {
	
	public Persona(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
	}
	public Persona() {super();}
	private static final long serialVersionUID = 6509551689672833050L;
	protected String nome;
	protected String cognome;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	@Override
	public String toString() {
		return "Persona [nome=" + nome + ", cognome=" + cognome + ", id=" + id + "]";
	}
	

}
