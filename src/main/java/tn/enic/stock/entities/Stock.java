package tn.enic.stock.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Stock implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String address;

	@OneToMany(mappedBy = "stock")
	private List<Produit> produitList;

	public Stock() {
		// TODO Auto-generated constructor stub
	}

	public Stock(String address, List<Produit> produitList) {
		this.address = address;
		this.produitList = produitList;
	}

	public Long getId() {
		return id;
	}

	public String getAddress() {
		return address;
	}

	public List<Produit> getProduitList() {
		return produitList;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setProduitList(List<Produit> produitList) {
		this.produitList = produitList;
	}

}
