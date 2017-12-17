package dao;

import java.util.HashSet;
import java.util.Set;

public class Produit {
  private Long idP;
  private String nom;
  private String description;
  private Double price;
  private Set<Category> categs = new HashSet<Category>();
  
  public Produit() {
		super();
	}
  
public Produit(String nom, String description, Double price) {
		super();
		this.nom = nom;
		this.description = description;
		this.price = price;	
	}
public Long getIdP() {
	return idP;
}
public void setIdP(Long idP) {
	this.idP = idP;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public Double getPrice() {
	return price;
}
public void setPrice(Double price) {
	this.price = price;
}
public Set<Category> getCategs() {
	return categs;
}
public void setCategs(Set<Category> categs) {
	this.categs = categs;
}
public void show(){
	System.out.println(" Le produit : "+this.nom+" - "
    +this.description+" - il coûte : "+this.price.toString()+" Dirhams");    	
}  
}
