package tn.esprit.tic.springproj.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Championnat {

    @Id
    private Long idChampionnat;

    private Category categorie;

    private String libelleC;

    private Integer annee;
    @OneToOne
    private DetailChampionnat championnatDetail;

    @ManyToMany(cascade = CascadeType.PERSIST,fetch= FetchType.EAGER)
    private List<Course> courses;
}
