package tn.esprit.tic.springproj.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tic.springproj.Repository.DetailCampionnatRpository;
@Service
@AllArgsConstructor
public class DetailChampionnat implements IDetailChampionnat {
    DetailCampionnatRpository detailCampionnatRpository;
}
