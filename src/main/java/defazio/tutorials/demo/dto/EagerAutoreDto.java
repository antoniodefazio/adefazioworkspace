package defazio.tutorials.demo.dto;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;



public class EagerAutoreDto extends AutoreDto{
	
	 private List<LibroDto> libri=new ArrayList<>();

	public List<LibroDto> getLibri() {
		return libri;
	}

	public void setLibri(List<LibroDto> libri) {
		this.libri = libri;
	}
	 
	 

}
