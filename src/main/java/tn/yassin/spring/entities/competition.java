package tn.yassin.spring.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class competition {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	
private Integer idcompetition;
private String nom;
private Integer nombreequipe;


public Integer getIdcompetition() {
	return idcompetition;
}
public void setIdcompetition(Integer idcompetition) {
	this.idcompetition = idcompetition;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public Integer getNombreequipe() {
	return nombreequipe;
}
public void setNombreequipe(Integer nombreequipe) {
	this.nombreequipe = nombreequipe;
}


public competition(Integer idcompetition, String nom, Integer nombreequipe) {
	super();
	this.idcompetition = idcompetition;
	this.nom = nom;
	this.nombreequipe = nombreequipe;
}


public competition() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "competition [idcompetition=" + idcompetition + ", nom=" + nom + ", nombreequipe=" + nombreequipe + "]";
}





}
