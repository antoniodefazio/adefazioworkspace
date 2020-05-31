package defazio.tutorials.demo.converters;


import defazio.tutorials.demo.dto.AutoreDto;
import defazio.tutorials.demo.entities.Autore;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class AutoreToAutoreDto implements Converter<Autore, AutoreDto> {

    @Override
    public AutoreDto convert(Autore autore){
        if(autore==null){return null;}
        final AutoreDto autoreDto=new AutoreDto();
        extraction(autore, autoreDto);
        return autoreDto;
    }

	public void extraction(Autore autore, final AutoreDto autoreDto) {
		autoreDto.setName(autore.getNome());
        autoreDto.setSurname(autore.getCognome());
	}
}
