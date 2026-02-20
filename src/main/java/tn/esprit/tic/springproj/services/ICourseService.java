package tn.esprit.tic.springproj.services;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tic.springproj.entities.Course;

public interface ICourseService extends JpaRepository<Course, Integer> {
}
