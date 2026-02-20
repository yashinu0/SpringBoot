package tn.esprit.tic.springproj.services;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tic.springproj.entities.Pilote;
import tn.esprit.tic.springproj.Repository.PiloteRepository;
@Service
@AllArgsConstructor
public class PiloteService implements IPiloteService {
    PiloteRepository pr;
    @Override
    public String addPilote(Pilote p) {
        pr.save(p);
        return "pilote ajoutee ";
    }
}
