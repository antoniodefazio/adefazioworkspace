package defazio.tutorials.demo.service;

import defazio.tutorials.demo.converters.AutoreToAutoreDto;
import defazio.tutorials.demo.converters.LibroToLibroDto;
import defazio.tutorials.demo.dto.AutoreDto;
import defazio.tutorials.demo.dto.EagerAutoreDto;
import defazio.tutorials.demo.dto.EagerLibroDto;
import defazio.tutorials.demo.entities.Autore;
import defazio.tutorials.demo.entities.Libro;
import defazio.tutorials.demo.repositories.AutoreRepository;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.stream.Collectors;


@Service
public class AutoreServiceImpl extends AbstractRepoService<Autore,Long,AutoreDto> implements AutoreService {
    AutoreRepository autoreRepository;
    AutoreToAutoreDto converter;

    public AutoreServiceImpl(AutoreRepository autoreRepository, AutoreToAutoreDto converter) {
        super(autoreRepository,converter);
    }

    @Override
    public List<AutoreDto> autoriDto() {

        return super.dtos();
    }

	@Override
	public AutoreDto getAutoreDto(Long id) {
		
		return super.dto(id);
	}
	private static final LibroToLibroDto convLibro=new LibroToLibroDto();
    private static final AutoreToAutoreDto convAutore=new AutoreToAutoreDto();
	@Override
	public EagerAutoreDto getFatAutoreDto(Long id) {
	
		return (EagerAutoreDto)
				super.anyViewDto(id, (Autore autore) -> {
					EagerAutoreDto eagerAutoreDto=new EagerAutoreDto();
					convAutore.extraction(autore, eagerAutoreDto);
					eagerAutoreDto.setLibri(autore.getLibri().stream().map(convLibro::convert)
		                .collect(Collectors.toList()));
					return eagerAutoreDto;
					} );
	}

}
