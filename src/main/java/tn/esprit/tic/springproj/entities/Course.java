package tn.esprit.tic.springproj.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Course {

    @Id
    private Long idCourse;

    private String emplacement;

    private LocalDate dateCourse;

    @ManyToMany(mappedBy="courses", cascade = CascadeType.PERSIST,fetch= FetchType.EAGER)
    private List<Championnat> Championnats;

    @OneToMany(mappedBy = "course", cascade = CascadeType.PERSIST)
    private List<Position> Positions;
}
