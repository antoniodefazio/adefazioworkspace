package defazio.tutorials.demo.service;

import defazio.tutorials.demo.converters.AutoreToAutoreDto;
import defazio.tutorials.demo.converters.LibroToLibroDto;
import defazio.tutorials.demo.dto.AutoreDto;
import defazio.tutorials.demo.dto.EagerLibroDto;
import defazio.tutorials.demo.dto.LibroDto;
import defazio.tutorials.demo.entities.Autore;
import defazio.tutorials.demo.entities.Libro;
import defazio.tutorials.demo.repositories.LibroRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LibroServiceImpl extends AbstractRepoService<Libro,Long, LibroDto> implements LibroService {
  

    
	
	public LibroServiceImpl(LibroRepository libroRepository, 
    		Converter<Libro, LibroDto> converter)
    	{
        super(libroRepository,converter);
    }
	

    @Override
    public List<LibroDto> libriDto() {
        return super.dtos();

    }

	@Override
	public LibroDto getLibroDto(Long id) {
		   return super.dto(id);
	}

    private static final LibroToLibroDto convLibro=new LibroToLibroDto();
    private static final AutoreToAutoreDto convAutore=new AutoreToAutoreDto();
	@Override
	public EagerLibroDto getFatLibroDto(Long id) {
	
		return (EagerLibroDto)
				super.anyViewDto(id, (Libro libro) -> {
					EagerLibroDto eagerLibroDto=new EagerLibroDto();
					convLibro.extractor(libro, eagerLibroDto);
				eagerLibroDto.setAutori(libro.getAutori().stream().map(convAutore::convert)
		                .collect(Collectors.toList()));
					return eagerLibroDto;
					} );
	}
	
}
