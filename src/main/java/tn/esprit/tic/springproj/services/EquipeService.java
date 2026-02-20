package tn.esprit.tic.springproj.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tic.springproj.entities.Equipe;
import tn.esprit.tic.springproj.Repository.EquipeRepository;
@Service
@AllArgsConstructor
public class EquipeService implements IEquipeService {
    EquipeRepository er;
    @Override
    public Equipe ajouterEquipe(Equipe equipe) {
        er.save(equipe);
        return equipe;
    }
}
