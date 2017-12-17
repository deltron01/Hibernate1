package dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import util.HibernateUtil;

public class Services {

	
	public void addProduit(Produit p) throws HibernateException {
		Session session;		
		try {         
			   session = HibernateUtil.getSessionFactory().getCurrentSession();  
		} catch (org.hibernate.HibernateException exp) {  
			   session = HibernateUtil.getSessionFactory().openSession();     
		} 		
		session.beginTransaction();
		session.save(p);
		session.getTransaction().commit();
	}
   public Produit getProduit(Long idd){
	   Session session;		
		try {         
			   session = HibernateUtil.getSessionFactory().getCurrentSession();  
		} catch (org.hibernate.HibernateException exp) {  
			   session = HibernateUtil.getSessionFactory().openSession();     
		} 		
		session.beginTransaction();
		Produit p = (Produit) session.load(Produit.class, idd);
		return p;
   }
   public List<Produit> getAllProd(){
	   Session session;		
		try {         
			   session = HibernateUtil.getSessionFactory().getCurrentSession();  
		} catch (org.hibernate.HibernateException exp) {  
			   session = HibernateUtil.getSessionFactory().openSession();     
		} 		
		session.beginTransaction();
		return  session.createQuery("FROM Produit").list();
   }
   public void addCategory( Category c){
	   Session session;		
		try {         
			   session = HibernateUtil.getSessionFactory().getCurrentSession();  
		} catch (org.hibernate.HibernateException exp) {  
			   session = HibernateUtil.getSessionFactory().openSession();     
		} 		
		session.beginTransaction();
		session.save(c);
		session.getTransaction().commit();
    	
    }
   public Category getCategory(Long idd){
	   Session session;		
		try {         
			   session = HibernateUtil.getSessionFactory().getCurrentSession();  
		} catch (org.hibernate.HibernateException exp) {  
			   session = HibernateUtil.getSessionFactory().openSession();     
		} 		
		session.beginTransaction();
		Category c = (Category) session.load(Category.class, idd);
		return c;
   }
   public List<Category> getAllCat(){
	   Session session;		
		try {         
			   session = HibernateUtil.getSessionFactory().getCurrentSession();  
		} catch (org.hibernate.HibernateException exp) {  
			   session = HibernateUtil.getSessionFactory().openSession();     
		} 		
		session.beginTransaction();
		return  session.createQuery("FROM Category").list();
   }
   public void addProdToCat (Long idd, Long idCat){
	   Session session;		
		try {         
			   session = HibernateUtil.getSessionFactory().getCurrentSession();  
		} catch (org.hibernate.HibernateException exp) {  
			   session = HibernateUtil.getSessionFactory().openSession();     
		} 		
		session.beginTransaction();
	    Produit p = (Produit) session.load(Produit.class, idd); // Select * From Produit Where ID = idd
	    Category c = (Category) session.load(Category.class, idCat);
	    c.getProduits().add(p);
	    p.getCategs().add(c);
		session.getTransaction().commit(); 
	   
   }
	
}
