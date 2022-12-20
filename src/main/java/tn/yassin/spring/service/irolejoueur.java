package tn.yassin.spring.service;

import java.util.List;


import tn.yassin.spring.entities.joueur;
import tn.yassin.spring.entities.rolejoueur;

public interface irolejoueur {
	
	public rolejoueur addrolejoueur(rolejoueur rj, Integer idjoueur);
	public joueur findjoueurbyidrolejsaisi(Integer idrolej);
	
	public List<rolejoueur> getallrolejoueur();


}
