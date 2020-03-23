package defazio.tutorials.demo.service;

import defazio.tutorials.demo.converters.AutoreToAutoreDto;
import defazio.tutorials.demo.dto.AutoreDto;
import defazio.tutorials.demo.models.Autore;
import defazio.tutorials.demo.repositories.AutoreRepository;
import org.springframework.stereotype.Service;


import java.util.List;


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
}
