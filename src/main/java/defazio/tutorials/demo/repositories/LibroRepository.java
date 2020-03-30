package defazio.tutorials.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import defazio.tutorials.demo.entities.Libro;



public interface LibroRepository extends JpaRepository<Libro,Long> {
}
