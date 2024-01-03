package Hibernate2st.LearnHibernate2.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Student {
	@Id
	private int id;
	private String name;
	private int age;
	@OneToOne
	private Bike b;
	public Student(int id, String name, int age, Bike b) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.b = b;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Bike getB() {
		return b;
	}
	public void setB(Bike b) {
		this.b = b;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", b=" + b + "]";
	}
	
	
}
