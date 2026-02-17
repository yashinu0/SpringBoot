package tn.esprit.tic.springproj.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tic.springproj.entities.Pilote;

public interface PiloteRepository extends JpaRepository<Pilote,Long> {
}
