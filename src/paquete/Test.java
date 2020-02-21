package paquete;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
	
		SessionFactory sf=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Departamento.class).buildSessionFactory();
		Session s=sf.getCurrentSession();
		Departamento d=new Departamento("100","Fruteros","Merida");
		s.beginTransaction();
		s.save(d);
		s.getTransaction().commit();
		
		
		
		
	}
	
	
}
