package defazio.tutorials.demo.service;



import defazio.tutorials.demo.dto.AutoreDto;
import defazio.tutorials.demo.dto.EagerAutoreDto;
import defazio.tutorials.demo.dto.EagerLibroDto;

import java.util.List;

public interface AutoreService {
    List<AutoreDto> autoriDto();
    AutoreDto getAutoreDto(Long id);
    EagerAutoreDto getFatAutoreDto(Long id);
}
