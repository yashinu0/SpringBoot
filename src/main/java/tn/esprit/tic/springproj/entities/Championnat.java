package tn.esprit.tic.springproj.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Championnat {

    @Id
    private Long idChampionnat;

    private Category categorie;

    private String libelleC;

    private Integer annee;
}
