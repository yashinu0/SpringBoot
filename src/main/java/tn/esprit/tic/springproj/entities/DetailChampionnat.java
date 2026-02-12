package tn.esprit.tic.springproj.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class DetailChampionnat {

    @Id
    private String code;

    private String description;

    @OneToOne(mappedBy="championnatDetail")
    private Championnat championnat;
}
