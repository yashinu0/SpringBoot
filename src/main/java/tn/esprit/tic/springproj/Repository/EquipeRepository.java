package tn.esprit.tic.springproj.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tic.springproj.entities.Equipe;

public interface EquipeRepository extends JpaRepository<Equipe,Long> {
}
