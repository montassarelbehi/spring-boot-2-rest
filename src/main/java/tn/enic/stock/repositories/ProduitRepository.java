package tn.enic.stock.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.enic.stock.entities.Produit;
import tn.enic.stock.entities.Stock;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

	public List<Produit> findByType(String type);

	public List<Produit> findByTypeAndStock(String type, Stock stock);

	public Integer countByTypeAndStock(String type, Stock stock);

}
