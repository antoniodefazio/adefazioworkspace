package defazio.tutorials.demo.converters;

import defazio.tutorials.demo.dto.LibroDto;
import defazio.tutorials.demo.entities.Libro;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class LibroToLibroDto implements Converter<Libro, LibroDto> {

    @Override
public LibroDto convert(Libro libro){
    if(libro==null){ return null;}
    final LibroDto libroDto=new LibroDto();
    libroDto.setCasaEditrice(libro.getCasaEditrice());
    libroDto.setIsbn(libro.getIsbn());
    libroDto.setTitolo(libro.getTitolo());
    return libroDto;

}

}
