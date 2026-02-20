package tn.esprit.tic.springproj.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.tic.springproj.services.ISponsorService;

@RestController
@AllArgsConstructor
public class SponsorController {
    ISponsorService sponsorService;
}
