package defazio.tutorials.demo.converters;


import defazio.tutorials.demo.dto.AutoreDto;
import defazio.tutorials.demo.models.Autore;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class AutoreToAutoreDto implements Converter<Autore, AutoreDto> {

    @Override
    public AutoreDto convert(Autore autore){
        if(autore==null){return null;}
        final AutoreDto autoreDto=new AutoreDto();
        autoreDto.setName(autore.getName());
        autoreDto.setSurname(autore.getSurname());
        return autoreDto;
    }
}
