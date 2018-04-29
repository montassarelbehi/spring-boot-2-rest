package tn.enic.stock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.enic.stock.entities.Utilisateur;
import tn.enic.stock.repositories.UtilisateurRepository;

@RequestMapping("/utilisateur")
@RestController
public class UtilisateurController {

	@Autowired
	private UtilisateurRepository utilisateurRepo;

	@PostMapping("/upsert")
	public Utilisateur addOrUpdate(@RequestBody Utilisateur utilisateur) {

		return utilisateurRepo.save(utilisateur);
	}

	@GetMapping("/login/{login}/{password}")
	public Utilisateur getByLoginAndPassword(@PathVariable String login, @PathVariable String password) {

		return utilisateurRepo.findByLoginAndPassword(login, password);
	}

}
