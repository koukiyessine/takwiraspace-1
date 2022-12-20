package tn.yassin.spring.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tn.yassin.spring.entities.joueur;
import tn.yassin.spring.entities.rolejoueur;
import tn.yassin.spring.service.servicerolejoueur;

@RestController
public class rolejoueurcontroler {

	@Autowired
	servicerolejoueur rjserv;
	
	@PostMapping("/addrolejoueur/{idj}")
	public rolejoueur addrolejoueur(@RequestBody rolejoueur rj ,@PathVariable("idj") Integer idjoueur) {
		
		return rjserv.addrolejoueur(rj,idjoueur);

}
    @GetMapping("/findjoueurbyidrolejsaisi/idr")
	public joueur findjoueurbyidrolejsaisi(@PathVariable("idr") Integer idrolej) {

	  return rjserv.findjoueurbyidrolejsaisi(idrolej);
	}	
	
	@GetMapping("/getallrolejoueur")
	public List<rolejoueur> getallrolejoueur() {
      
		return rjserv.getallrolejoueur();
}

	
}