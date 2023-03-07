package fishcatalog.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Bradh 
 * CIS175 23290 Java II Spring 2023
 * Mar 6, 2023
 */

@Entity
public class Fishes {
	
	@Id
	@GeneratedValue
	private long id;
	private String name;
	private double inches;
	private double pounds;
	@Autowired
	private Location location;
	
	public Fishes() {
		super();
	}
	
	public Fishes(String name) {
		super();
		this.name = name;
	}
	
	public Fishes(String name, double inches, double pounds) {
		super();
		this.name = name;
		this.inches = inches;
		this.pounds = pounds;
	}
	
	public Fishes(long id, String name, double inches, double pounds) {
		super();
		this.id = id;
		this.name = name;
		this.inches = inches;
		this.pounds = pounds;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getInches() {
		return inches;
	}
	public void setInches(double inches) {
		this.inches = inches;
	}
	public double getPounds() {
		return pounds;
	}
	public void setPounds(double pounds) {
		this.pounds = pounds;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Fishes [id=" + id + ", name=" + name + ", inches=" + inches + ", pounds=" + pounds + ", location="
				+ location + "]";
	}

}
