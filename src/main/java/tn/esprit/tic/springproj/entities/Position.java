package tn.esprit.tic.springproj.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Position {

    @Id
    private Long idPosition;

    private Integer classement;

    private Integer nbPoints;
    @ManyToOne
    private Course course;

    @ManyToOne
    private Pilote pilote;
}
