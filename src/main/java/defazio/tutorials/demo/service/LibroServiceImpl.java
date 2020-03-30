package defazio.tutorials.demo.service;

import defazio.tutorials.demo.converters.LibroToLibroDto;
import defazio.tutorials.demo.dto.AutoreDto;
import defazio.tutorials.demo.dto.LibroDto;
import defazio.tutorials.demo.entities.Autore;
import defazio.tutorials.demo.entities.Libro;
import defazio.tutorials.demo.repositories.LibroRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroServiceImpl extends AbstractRepoService<Libro,Long, LibroDto> implements LibroService {
    private LibroRepository libroRepository;
    private LibroToLibroDto converter;

    public LibroServiceImpl(LibroRepository libroRepository, LibroToLibroDto converter) {
        super(libroRepository,converter);
    }

    @Override
    public List<LibroDto> libriDto() {
        return super.dtos();

    }
}
