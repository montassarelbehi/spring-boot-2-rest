package tn.enic.stock.entities;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Produit implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String libelle;

	private BigDecimal prix;

	private String type;

	@JsonIgnore
	@ManyToOne
	private Stock stock;

	public Produit() {
		// TODO Auto-generated constructor stub
	}

	public Produit(String libelle, BigDecimal prix, String type, Stock stock) {
		super();
		this.libelle = libelle;
		this.prix = prix;
		this.type = type;
		this.stock = stock;
	}

	public Long getId() {
		return id;
	}

	public String getLibelle() {
		return libelle;
	}

	public BigDecimal getPrix() {
		return prix;
	}

	public String getType() {
		return type;
	}

	public Stock getStock() {
		return stock;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public void setPrix(BigDecimal prix) {
		this.prix = prix;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}

}
