package tn.enic.stock.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.enic.stock.entities.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {

	//
	public Utilisateur findByLoginAndPassword(String login, String password);
}
