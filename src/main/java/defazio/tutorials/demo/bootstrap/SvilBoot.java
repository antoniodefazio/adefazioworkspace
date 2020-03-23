package defazio.tutorials.demo.bootstrap;

import defazio.tutorials.demo.models.Autore;
import defazio.tutorials.demo.models.Libro;
import defazio.tutorials.demo.repositories.AutoreRepository;
import defazio.tutorials.demo.repositories.LibroRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class SvilBoot implements ApplicationListener<ContextRefreshedEvent> {


   private AutoreRepository autoreRepository;
   private LibroRepository libroRepository;

    public SvilBoot(AutoreRepository autoreRepository, LibroRepository libroRepository) {
        this.autoreRepository = autoreRepository;
        this.libroRepository = libroRepository;
    }

    private void inizializzaDb(){
        Autore nuseba=new Autore("Nora","Rosssi");
        Libro b1=new Libro("Design","12345","Riad PrintHouse");
        nuseba.getLibri().add(b1);
        b1.getAutori().add(nuseba);
        autoreRepository.save(nuseba);
        libroRepository.save(b1);
        Autore nba2=new Autore("Antonio","De Fazio");
        Libro b2=new Libro("IT Design","12346","Milano PrintHouse");
        nba2.getLibri().add(b2);
        b2.getAutori().add(nba2);
        autoreRepository.save(nba2);
        libroRepository.save(b2);

    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        inizializzaDb();

    }
}
