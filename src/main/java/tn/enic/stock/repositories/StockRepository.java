package tn.enic.stock.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.enic.stock.entities.Stock;

public interface StockRepository extends JpaRepository<Stock, Long> {
	//
}
