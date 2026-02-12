package tn.esprit.tic.springproj.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Contrat {

    @Id
    private Long idContrat;

    private Float montant;

    private String annee;

    private Boolean archived;
    @ManyToOne
    private Equipe equipe;

    @ManyToOne
    private Sponsor sponsor;
    @OneToMany(cascade = CascadeType.PERSIST, mappedBy="sponsor")
    private List<Contrat> contrats;
}
