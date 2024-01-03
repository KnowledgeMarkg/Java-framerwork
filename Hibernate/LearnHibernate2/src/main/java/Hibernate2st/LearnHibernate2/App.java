package Hibernate2st.LearnHibernate2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import Hibernate2st.LearnHibernate2.entity.Bike;
import Hibernate2st.LearnHibernate2.entity.Student;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration();
    	cfg.configure();
    	SessionFactory sessionFactory = cfg.buildSessionFactory();
    	Session session = sessionFactory.openSession();
    	Transaction transaction = session.beginTransaction();
    	Bike b1 = new Bike(101,"Bugati","Blue","Petrol", "150000");
    	Bike b2 = new Bike(102,"Ola","While","Electric", "100000");
    	Bike b3 = new Bike(103,"Bugati","Blue","Petrol", "150000");
    	Student student1 = new Student(101, "kausar", 23, b1);
    	Student student2 = new Student(102, "Faiz Raza", 22, b2);
    	Student student3 = new Student(103, "Rozi", 21, b3);
    	session.save(student1);
    	session.save(student2);
    	session.save(student3);
    	session.save(b1);
    	session.save(b2);
    	transaction.commit();
    	System.out.println("Succes ");
    	session.close();
        System.out.println( "Hello World!" );
    }
}
