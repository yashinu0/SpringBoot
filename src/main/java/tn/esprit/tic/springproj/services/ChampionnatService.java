package tn.esprit.tic.springproj.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tic.springproj.Repository.ChampionnatRpository;
@Service
@AllArgsConstructor
public class ChampionnatService implements IChampionnatService {
    ChampionnatRpository championnatRpository;
}
