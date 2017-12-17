import java.util.Date;
import java.util.Iterator;

import dao.Category;
import dao.Produit;
import dao.Services;



public class Test {
	
	

	public static void main(String[] args) {
		// Load sevice
		Services s = new Services();
		//  les Produits
        /* Produit p1 = new Produit("Voiture", "Volkswagen",360000.00);
        Produit p2 = new Produit("Camera", "Canon",1000.00);
        Produit p3 = new Produit("TV", "Sony",4000.00);
        Produit p4 = new Produit("Telephone", "Nokia",1200.00);
        Produit p5 = new Produit("Videoscope", "Samsung",1400.00);
        s.addProduit(p1);
        s.addProduit(p2);
        s.addProduit(p3);
        s.addProduit(p4);
        s.addProduit(p5);
        //  les Categories
        Category c1 = new Category("Informatique1","Machines informatique, outils multimédia1", new Date());
        Category c2 = new Category("Automobile","Maison Frankfurt", new Date());
        Category c3 = new Category("Informatique3","Machines informatique, outils multimédia3", new Date());
        Category c4 = new Category("Informatique4","Machines informatique, outils multimédia4", new Date());
        s.addCategory(c1);
        s.addCategory(c2);
        s.addCategory(c3);
        s.addCategory(c4); 
        //  Get de la BD
        Category c = s.getCategory(1L);
        c.show();
        Produit p = s.getProduit(2L);
        p.show();
		//  List des produits
		Iterator<Produit> produits = s.getAllProd().iterator();
		System.out.println(" $$$ La liste complète des produits : $$$");
		while( produits.hasNext()){
			Produit pro = produits.next();
			pro.show();
		}*/
		
		//  Affectation  produit ---> Catégorie  
		/*System.out.println(" $$$ Affectation  Produits ---> Catégories : $$$");
		s.addProdToCat(1L, 4L);
		s.addProdToCat(2L, 2L);
		s.addProdToCat(1L, 3L);
		s.addProdToCat(3L, 2L);
		s.addProdToCat(4L, 2L);
	    s.addProdToCat(5L, 4L);*/
		// charger Catégorie avac ses produits
		Category ch = s.getCategory(2L);
		System.out.println(" $$$ Informations sur la Catégories 2 : $$$");
		ch.show();
		System.out.println(" $$$ Produits de cette Catégories : $$$");
		Iterator<Produit> it = ch.getProduits().iterator();
		while(it.hasNext()){
			Produit pt = it.next();
			pt.show();
		}
		// Cahrger produit avec ses Catégories
		Produit pr = s.getProduit(1L);
		System.out.println(" $$$ Informations sur le produit 1 : $$$");
		pr.show();
		System.out.println(" $$$ Catégories de ce produit : $$$");
		Iterator<Category> itt = pr.getCategs().iterator();
		while(itt.hasNext()){
			Category ct = itt.next();
			ct.show();
		} 
	}
    
}
