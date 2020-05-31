package defazio.tutorials.demo.service;

import defazio.tutorials.demo.dto.EagerLibroDto;
import defazio.tutorials.demo.dto.LibroDto;

import java.util.List;

public interface LibroService {

List<LibroDto> libriDto();
LibroDto getLibroDto(Long id);
EagerLibroDto getFatLibroDto(Long id);


}
