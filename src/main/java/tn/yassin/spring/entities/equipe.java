package tn.yassin.spring.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class equipe {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

private Integer idequipe;
private String nom;
private String couleur;
private Integer nbjoueur;
private Integer temps;



public Integer getIdequipe() {
	return idequipe;
}
public void setIdequipe(Integer idequipe) {
	this.idequipe = idequipe;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getCouleur() {
	return couleur;
}
public void setCouleur(String couleur) {
	this.couleur = couleur;
}
public Integer getNbjoueur() {
	return nbjoueur;
}
public void setNbjoueur(Integer nbjoueur) {
	this.nbjoueur = nbjoueur;
}
public Integer getTemps() {
	return temps;
}
public void setTemps(Integer temps) {
	this.temps = temps;
}



public equipe(Integer idequipe, String nom, String couleur, Integer nbjoueur, Integer temps) {
	super();
	this.idequipe = idequipe;
	this.nom = nom;
	this.couleur = couleur;
	this.nbjoueur = nbjoueur;
	this.temps = temps;
}


public equipe() {
	super();
	// TODO Auto-generated constructor stub
}


@Override
public String toString() {
	return "equipe [idequipe=" + idequipe + ", nom=" + nom + ", couleur=" + couleur + ", nbjoueur=" + nbjoueur
			+ ", temps=" + temps + "]";
}




}
