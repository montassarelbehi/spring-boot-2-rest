package tn.enic.stock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import tn.enic.stock.entities.Utilisateur;
import tn.enic.stock.repositories.UtilisateurRepository;

/**
 * This is a Spring Boot 2.x Application.
 * <p>
 * For demonstration purpose.
 * </p>
 * 
 * @author m.elbehi
 * @since 2k18
 * 
 */
@SpringBootApplication
public class TestStockApplication {

	@Autowired
	private UtilisateurRepository utilisateurRepo;

	public static void main(String[] args) {
		SpringApplication.run(TestStockApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void run(ApplicationReadyEvent evt) {

		utilisateurRepo.save(new Utilisateur("login", "ben foulen", "foulen", "pwd"));

	}

}
