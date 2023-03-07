package fishcatalog.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import fishcatalog.beans.Fishes;
import fishcatalog.beans.Location;

/**
 * @author Bradh 
 * CIS175 23290 Java II Spring 2023
 * Mar 6, 2023
 */

@Configuration
public class BeanConfiguration {

	@Bean
	public Fishes fishes() {
		
		Fishes bean = new Fishes();
		bean.setName("Large Mouth Bass");
		bean.setInches(16.5);
		bean.setPounds(10);
		return bean;	
	}
	
	@Bean
	public Location location() {
		
		// A lake called Rock Creek - somewhat misleading but I didn't name it
		Location bean = new Location("Rock Creek", "Lake and state park");
		return bean;
	}
	
}
