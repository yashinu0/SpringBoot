package tn.esprit.tic.springproj.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Equipe {

    @Id
    private Long idEquipe;

    private String libelle;

    private Integer nbPointsTotal;

    private Integer classementGeneral;
    @OneToMany(mappedBy = "equipe", cascade = CascadeType.PERSIST)
    private List<Pilote> Pilotes;

    @OneToMany(mappedBy = "equipe", cascade = CascadeType.PERSIST)
    private List<Contrat> contarts;
}
