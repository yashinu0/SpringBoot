package tn.esprit.tic.springproj.services;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tic.springproj.entities.Position;

public interface IPositionService extends JpaRepository<Position, Integer> {
}
