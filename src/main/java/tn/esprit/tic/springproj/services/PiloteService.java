package tn.esprit.tic.springproj.services;
import tn.esprit.tic.springproj.entities.Pilote;
import tn.esprit.tic.springproj.Repository.PiloteRepository;

public class PiloteService implements IPiloteService {
    PiloteRepository pr;
    @Override
    public String addPilote(Pilote p) {
        pr.save(p);
        return "pilote ajoutee ";
    }
}
