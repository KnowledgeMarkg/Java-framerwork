package Hibernate1st.LearnHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
    	Configuration configuration = new Configuration();
    	configuration.configure("hibernate.cfg.xml");
    	SessionFactory sessionFactory = configuration.buildSessionFactory();
    	System.out.println(sessionFactory);
        System.out.println( "Hello World!" );
        Student st = new Student(101, "Kauusar Raza", 18);
        Student st1 = new Student(102, "Pagal",19 );
        
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(st);
        session.save(st1);
        tx.commit();
        session.close();
        
        System.out.println(st);
        System.out.println(st1);
        System.out.println(sessionFactory);
        
    }
}
