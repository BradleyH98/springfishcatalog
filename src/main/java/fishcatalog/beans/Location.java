package fishcatalog.beans;

import javax.persistence.Embeddable;

/**
 * @author Bradh 
 * CIS175 23290 Java II Spring 2023
 * Mar 6, 2023
 */

@Embeddable
public class Location {

	private String locationName;
	private String waterbodyType;
	
	public Location() {
		super();
	}
	
	public Location(String locationName, String waterbodyType) {
		super();
		this.locationName = locationName;
		this.waterbodyType = waterbodyType;
	}
	
	public String getLocationName() {
		return locationName;
	}
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}
	public String getWaterbodyType() {
		return waterbodyType;
	}
	public void setWaterbodyType(String waterbodyType) {
		this.waterbodyType = waterbodyType;
	}

	@Override
	public String toString() {
		return "Location [locationName=" + locationName + ", waterbodyType=" + waterbodyType + "]";
	}

}
