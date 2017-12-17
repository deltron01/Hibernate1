package dao;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Category {
   private Long idcategory;
   private String titre;
   private String description;
   private Date dateAjout;
   private Set<Produit> produits = new HashSet<Produit>();      

   public Category() {
	super();

   }
   
    public Category(String titre, String description, Date dateAjout) {
	 super();
	 this.titre = titre;
	 this.description = description;
	 this.dateAjout = dateAjout;
    }    
	public Long getIdcategory() {
		return idcategory;
	}

	public void setIdcategory(Long idcategory) {
		this.idcategory = idcategory;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDateAjout() {
		return dateAjout;
	}

	public void setDateAjout(Date dateAjout) {
		this.dateAjout = dateAjout;
	}
	public Set<Produit> getProduits() {
		return produits;
	}

	public void setProduits(Set<Produit> produits) {
		this.produits = produits;
	}
	public void show(){
	    	System.out.println(" La catégorie : "+this.titre+" - "+this.description+" - Ajoutée le : "+this.dateAjout.toString());    	
	}
   
}
