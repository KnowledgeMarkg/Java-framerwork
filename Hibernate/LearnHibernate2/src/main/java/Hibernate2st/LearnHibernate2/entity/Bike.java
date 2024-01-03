package Hibernate2st.LearnHibernate2.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bike {
	@Id
	private int id;
	private String bike_name;
	private String bike_color;
	private String bike_type;
	private String bike_price;

	public Bike(int id, String bike_name, String bike_color, String bike_type, String bike_price) {
		super();
		this.id = id;
		this.bike_name = bike_name;
		this.bike_color = bike_color;
		this.bike_type = bike_type;
		this.bike_price = bike_price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBike_name() {
		return bike_name;
	}

	public void setBike_name(String bike_name) {
		this.bike_name = bike_name;
	}

	public String getBike_color() {
		return bike_color;
	}

	public void setBike_color(String bike_color) {
		this.bike_color = bike_color;
	}

	public String getBike_type() {
		return bike_type;
	}

	public void setBike_type(String bike_type) {
		this.bike_type = bike_type;
	}

	public String getBike_price() {
		return bike_price;
	}

	public void setBike_price(String bike_price) {
		this.bike_price = bike_price;
	}

	@Override
	public String toString() {
		return "Bike [id=" + id + ", bike_name=" + bike_name + ", bike_color=" + bike_color + ", bike_type=" + bike_type
				+ ", bike_price=" + bike_price + "]";
	}

	public Bike() {
		super();
		// TODO Auto-generated constructor stub
	}

}
