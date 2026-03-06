package tn.esprit.tic.springproj.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tic.springproj.entities.Sponsor;
import tn.esprit.tic.springproj.services.ISponsorService;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@AllArgsConstructor
@RestController
@RequestMapping("/sponsor")
public class SponsorController {
    ISponsorService sponsorService ;
    @PostMapping("/add-sponsor")
    public Sponsor AjouterSponsor(@RequestBody Sponsor s) {
        Sponsor sponsor = sponsorService.ajouterSponsor(s);
        return sponsor;
    }
    @GetMapping("/retrieve-all-sponsors")
    public List<Sponsor> getSponsors() {
        List<Sponsor> listSponsors = sponsorService.listSponsors();
        return listSponsors;
    }
    @GetMapping("/retrieve-sponsor/{sponsor-id}")
    public Sponsor retrieveSponsor(@PathVariable("sponsor-id") Long sponsorId) {
        return sponsorService.recupererSponsor(sponsorId);
    }
    @PutMapping("/update-sponsor")
    public Sponsor updateSponsor(@RequestBody Sponsor s) {
        Sponsor sponsor = sponsorService.modifierSponsor(s);
        return sponsor;
    }
    @DeleteMapping("/remove-sponsor/{sponsor-id}")
    public void removeSponsor(@PathVariable("sponsor-id") Long sponsorId) {
        sponsorService.supprimerSponsor(sponsorId);
    }
}