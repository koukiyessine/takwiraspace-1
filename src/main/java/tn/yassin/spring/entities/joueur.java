package tn.yassin.spring.entities;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;




import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class joueur {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

private Integer idjoueur;	
private String nom;
private String prenom;
private Integer cin;
private Integer tel ;
private String Type;
private Integer njoueur;


@JsonIgnore
@ManyToMany
@JoinTable(name="joueurterrain",joinColumns = @JoinColumn(name="idjoueur"),inverseJoinColumns = @JoinColumn(name="idterrain") )
public List<terrain> listterrain=new ArrayList<terrain>();

@OneToOne
private filee file;

@OneToOne

private rolejoueur rolejoueur;

public Integer getIdjoueur() {
	return idjoueur;
}

public void setIdjoueur(Integer idjoueur) {
	this.idjoueur = idjoueur;
}

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public String getPrenom() {
	return prenom;
}

public void setPrenom(String prenom) {
	this.prenom = prenom;
}

public Integer getCin() {
	return cin;
}

public void setCin(Integer cin) {
	this.cin = cin;
}

public Integer getTel() {
	return tel;
}

public void setTel(Integer tel) {
	this.tel = tel;
}

public String getType() {
	return Type;
}

public void setType(String type) {
	Type = type;
}

public Integer getNjoueur() {
	return njoueur;
}

public void setNjoueur(Integer njoueur) {
	this.njoueur = njoueur;
}

public List<terrain> getListterrain() {
	return listterrain;
}

public void setListterrain(List<terrain> listterrain) {
	this.listterrain = listterrain;
}

public filee getFile() {
	return file;
}

public void setFile(filee file) {
	this.file = file;
}

public rolejoueur getRolejoueur() {
	return rolejoueur;
}

public void setRolejoueur(rolejoueur rolejoueur) {
	this.rolejoueur = rolejoueur;
}


@Override
public String toString() {
	return "joueur [idjoueur=" + idjoueur + ", nom=" + nom + ", prenom=" + prenom + ", cin=" + cin + ", tel=" + tel
			+ ", Type=" + Type + ", njoueur=" + njoueur + ", listterrain=" + listterrain 
			+ ", rolejoueur=" + rolejoueur + "]";
}


public joueur(Integer idjoueur, String nom, String prenom, Integer cin, Integer tel, String type, Integer njoueur,
		List<terrain> listterrain , rolejoueur rolejoueur) {
	super();
	this.idjoueur = idjoueur;
	this.nom = nom;
	this.prenom = prenom;
	this.cin = cin;
	this.tel = tel;
	this.Type = type;
	this.njoueur = njoueur;
	this.listterrain = listterrain;
	this.rolejoueur = rolejoueur;
}


public joueur() {
	super();
	// TODO Auto-generated constructor stub
}


public void addterrain(terrain tr) {
	
	this.listterrain.add(tr);
}


}

   








