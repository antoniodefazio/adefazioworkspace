package defazio.tutorials.demo.service;

import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.stream.Collectors;

public abstract class AbstractRepoService<T,ID,DTO> {
    JpaRepository<T,ID> repo;
    Converter<T,DTO> converter;

    public AbstractRepoService(JpaRepository<T, ID> repo, Converter<T, DTO> converter) {
        this.repo = repo;
        this.converter = converter;
    }
    List<DTO> dtos(){
        return repo.findAll().stream().map(converter::convert)
                .collect(Collectors.toList());

    }
}
