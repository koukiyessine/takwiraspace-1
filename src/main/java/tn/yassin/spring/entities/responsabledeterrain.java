package tn.yassin.spring.entities;



import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;




@Entity

public class responsabledeterrain {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	
private Integer idresponsable;
private Integer tel;
private String nom;
private String prenom;
private Integer nbterrain;

@OneToMany(mappedBy ="responsabledeterrain" )
private List<terrain> Listterrain;

public Integer getidresponsable() {
	return idresponsable;
}
public void setidresponsable(Integer idresponsable) {
	this.idresponsable = idresponsable;
}
public Integer getTel() {
	return tel;
}
public void setTel(Integer tel) {
	this.tel = tel;
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
public Integer getNbterrain() {
	return nbterrain;
}
public void setNbterrain(Integer nbterrain) {
	this.nbterrain = nbterrain;
}



public responsabledeterrain(Integer idresponsable, Integer tel, String nom, String prenom, Integer nbterrain) {
	super();
	this.idresponsable = idresponsable;
	this.tel = tel;
	this.nom = nom;
	this.prenom = prenom;
	this.nbterrain = nbterrain;
}



@Override
public String toString() {
	return "responsabledeterrain [idresponsable=" + idresponsable + ", tel=" + tel + ", nom=" + nom + ", prenom="
			+ prenom + ", nbterrain=" + nbterrain + "]";
}


public responsabledeterrain() {
	super();
	// TODO Auto-generated constructor stub
}





}
