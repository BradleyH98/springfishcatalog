package fishcatalog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import fishcatalog.beans.Fishes;
import fishcatalog.repository.FishRepository;

/**
 * @author Bradh 
 * CIS175 23290 Java II Spring 2023
 * Mar 19, 2023
 */

@Controller
public class WebController {
	
	@Autowired
	FishRepository repo;
	
	@GetMapping({"/", "/viewAll"})
	public String viewAllFish(Model model) {
		
		if (repo.findAll().isEmpty()) {
			return addNewFish(model);
		}
		
		model.addAttribute("fishes", repo.findAll());
		return "results";
	}

	@GetMapping("/inputFish")
	public String addNewFish(Model model) {
		Fishes f = new Fishes();
		model.addAttribute("newFish", f);
		return"input";
	}
	
	@PostMapping("/inputFish")
	public String addNewFish(@ModelAttribute Fishes f, Model model) {
		repo.save(f);
		return viewAllFish(model);
	}
	
	@GetMapping("/edit/{id}")
	public String showUpdateFish(@PathVariable("id") long id, Model model) {
		Fishes f = repo.findById(id).orElse(null);
		model.addAttribute("newFish", f);
		return "input";
	}
	
	@PostMapping("/update/{id}")
	public String reviseFish(Fishes f, Model model) {
		repo.save(f);
		return viewAllFish(model);
	}
	
	@GetMapping("/delete/{id}")
	public String deleteFish(@PathVariable("id") long id, Model model) {
		Fishes f = repo.findById(id).orElse(null);
		repo.delete(f);
		return viewAllFish(model);
	}

}
