package tn.esprit.tic.springproj.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tic.springproj.Repository.ContratRpository;
@Service
@AllArgsConstructor
public class ContratService implements IContratService {
    ContratRpository contratRpository;
}
