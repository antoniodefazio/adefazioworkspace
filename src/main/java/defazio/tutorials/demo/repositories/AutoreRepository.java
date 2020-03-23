package defazio.tutorials.demo.repositories;


import defazio.tutorials.demo.models.Autore;
import org.springframework.data.jpa.repository.JpaRepository;



public interface AutoreRepository extends JpaRepository<Autore,Long> {
}
