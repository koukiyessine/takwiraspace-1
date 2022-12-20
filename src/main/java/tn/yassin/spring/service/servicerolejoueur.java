package tn.yassin.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.yassin.spring.entities.joueur;
import tn.yassin.spring.entities.rolejoueur;
import tn.yassin.spring.repository.joueurrepository;
import tn.yassin.spring.repository.rolejoueurrepository;

@Service
public class servicerolejoueur  implements irolejoueur {
	
	
	@Autowired
	rolejoueurrepository rjrep;
	@Autowired
	joueurrepository joueurrep;

	@Override
	public rolejoueur addrolejoueur(rolejoueur rj, Integer idjoueur) {
     joueur jo=joueurrep.findById(idjoueur).get();	
	   rj.setJoueur(jo);	
		return rjrep.save(rj);
	}

	@Override
	public joueur findjoueurbyidrolejsaisi( Integer idrolej) {
		// TODO Auto-generated method stub
		return rjrep.findjoueurbyidrolejsaisi(idrolej);
	}

	@Override
	public List<rolejoueur> getallrolejoueur() {
		// TODO Auto-generated method stub
		return (List<rolejoueur>) rjrep.findAll();
	}

}	