package tn.esprit.tic.springproj.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.time.LocalDate;

@Entity
public class Course {

    @Id
    private Long idCourse;

    private String emplacement;

    private LocalDate dateCourse;
}
