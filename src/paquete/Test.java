package paquete;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class Test {

	public static void main(String[] args) {
	
	/*	SessionFactory sf=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Departamento.class).buildSessionFactory();
		Session s=sf.getCurrentSession();
		Departamento d=new Departamento("100","Fruteros","Merida");
		s.beginTransaction();
		s.save(d);
		s.getTransaction().commit();*/
		
		
		
		
		
		
		
		
		
		
		
		
		SessionFactory sf=new Configuration().configure().addAnnotatedClass(Departamento.class).buildSessionFactory();
		Session s=sf.getCurrentSession();
		s.beginTransaction();
		Departamento d=new Departamento("500", "Fruteross", "Merida");
		org.hibernate.query.Query query=s.createNativeQuery("{call departamenton(?)}", Departamento.class);
		query.setParameter(1, "10");
		
		List<Departamento> listados = (List<Departamento>) query.getResultList();
		
		System.out.println(listados);
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
