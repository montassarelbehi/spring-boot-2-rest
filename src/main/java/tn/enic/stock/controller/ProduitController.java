package tn.enic.stock.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.enic.stock.entities.Produit;
import tn.enic.stock.entities.Stock;
import tn.enic.stock.repositories.ProduitRepository;
import tn.enic.stock.repositories.StockRepository;

@RequestMapping("/produit")
@RestController
public class ProduitController {

	@Autowired
	private StockRepository stockRepo;
	@Autowired
	private ProduitRepository produitRepo;

	@PostMapping("/upsert/get/produit")
	public Produit addOrUpdateAndReturnIt(@RequestBody Produit produit) {

		return produitRepo.save(produit);
	}

	@PostMapping("/upsert/get/id")
	public Long addOrUpdateAndReturnItsId(@RequestBody Produit produit) {

		return produitRepo.save(produit).getId();
	}

	@GetMapping("/quantity/{type}/{stockId}")
	public Integer getQuantityByTypeInStock(@PathVariable String type, @PathVariable Long stockId) {

		Optional<Stock> stock = stockRepo.findById(stockId);

		return produitRepo.countByTypeAndStock(type, stock.get());
	}

	@GetMapping("/by/{productId}")
	public Produit getById(@PathVariable Long productId) {

		return produitRepo.findById(productId).get();
	}

	@GetMapping("/all")
	public List<Produit> getAll() {

		return produitRepo.findAll();
	}

	@GetMapping("/all/{type}")
	public List<Produit> getAllByType(@PathVariable String type) {

		return produitRepo.findByType(type);
	}

	@GetMapping("/all/{type}/{stockId}")
	public List<Produit> getAllByTypeInStock(@PathVariable String type, @PathVariable Long stockId) {

		Optional<Stock> stock = stockRepo.findById(stockId);

		return produitRepo.findByTypeAndStock(type, stock.get());
	}

	@DeleteMapping("/delete/by/{productId}")
	public void deleteById(@PathVariable Long productId) {

		produitRepo.deleteById(productId);
	}

	@DeleteMapping("/delete/all")
	public void deleteAll() {

		produitRepo.deleteAll();
	}

}
