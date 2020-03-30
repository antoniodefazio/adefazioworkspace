package defazio.tutorials.demo.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import defazio.tutorials.demo.entities.Autore;



public interface AutoreRepository extends JpaRepository<Autore,Long> {
}
