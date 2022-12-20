package tn.yassin.spring.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class rolejoueur {
	
@OneToOne (mappedBy = "rolejoueur")
private joueur joueur;
	
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)




private Integer idrolej;
private String nrole;


public joueur getJoueur() {
	return joueur;
}
public void setJoueur(joueur joueur) {
	this.joueur = joueur;
}
public Integer getIdrolej() {
	return idrolej;
}
public void setIdrolej(Integer idrolej) {
	this.idrolej = idrolej;
}
public String getNrole() {
	return nrole;
}
public void setNrole(String nrole) {
	this.nrole = nrole;
}


@Override
public String toString() {
	return "rolejoueur [joueur=" + joueur + ", idrolej=" + idrolej + ", nrole=" + nrole + "]";
}


public rolejoueur(joueur joueur, Integer idrolej, String nrole) {
	super();
	this.joueur = joueur;
	this.idrolej = idrolej;
	this.nrole = nrole;
}

public rolejoueur() {
	super();
	// TODO Auto-generated constructor stub
}





}
