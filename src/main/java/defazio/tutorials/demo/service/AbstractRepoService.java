package defazio.tutorials.demo.service;

import org.springframework.core.convert.converter.Converter;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.stream.Collectors;

public abstract class AbstractRepoService<T,ID,DTO> {
    private JpaRepository<T,ID> repo;
    private Converter<T,DTO> converter;
    
    public AbstractRepoService(JpaRepository<T, ID> repo, Converter<T, DTO> converter) {
        this.repo = repo;
        this.converter = converter;
    }
    


	public AbstractRepoService(JpaRepository<T, ID> repo) {
		super();
		this.repo = repo;
	}



	public List<DTO> dtos(){
        return repo.findAll().stream().map(converter::convert)
                .collect(Collectors.toList());

    }
    public DTO dto(ID id){
        return converter.convert(repo.findById(id).get());
           

    }
    List<Object> anyViewdtos(Converter<T,Object> converter){
        return repo.findAll().stream().map(converter::convert)
                .collect(Collectors.toList());

    }
    Object anyViewDto(ID id, Converter<T,Object> converter){
        return converter.convert(repo.findById(id).get());
           

    }
	public JpaRepository<T, ID> getRepo() {
		return repo;
	}
	public void setRepo(JpaRepository<T, ID> repo) {
		this.repo = repo;
	}
	public Converter<T, DTO> getConverter() {
		return converter;
	}
	public void setConverter(Converter<T, DTO> converter) {
		this.converter = converter;
	}
    
}
