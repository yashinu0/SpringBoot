package tn.esprit.tic.springproj.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tic.springproj.Repository.CourseRpository;
@Service
@AllArgsConstructor
public class CourseService implements ICourseService {
    CourseRpository courseRpository;
}
