package defazio.tutorials.demo.dto;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class EagerLibroDto extends LibroDto {
	 private List<AutoreDto> autori=new ArrayList<>();

	public List<AutoreDto> getAutori() {
		return autori;
	}

	public void setAutori(List<AutoreDto> autori) {
		this.autori = autori;
	}

	

}
