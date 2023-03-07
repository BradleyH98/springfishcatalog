package fishcatalog;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import fishcatalog.beans.Fishes;
import fishcatalog.beans.Location;
import fishcatalog.controller.BeanConfiguration;
import fishcatalog.repository.FishRepository;

@SpringBootApplication
public class SpringFishCatalogApplication implements CommandLineRunner {

	@Autowired
	FishRepository repo;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringFishCatalogApplication.class, args);
	}
	
	public void run(String... args) throws Exception{
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		Fishes con = appContext.getBean("fishes", Fishes.class);
		repo.save(con);
		
		//Created new stuff
		Fishes gar = new Fishes("Gar", 16, 9);
		Location rr = new Location("Red Rock", "Reservoir");
		gar.setLocation(rr);
		repo.save(gar);
		
		//For loop for reading it back
		List<Fishes> allMyContacts = repo.findAll();
		for(Fishes people: allMyContacts) {
			System.out.println(people.toString());
		}
		
		((AbstractApplicationContext) appContext).close();
	}

}
