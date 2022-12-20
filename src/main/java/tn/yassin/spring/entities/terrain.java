package tn.yassin.spring.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;




@Entity
public class terrain {
		
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer idterrain;
private String place;
private Integer distance;
private Integer longeur;
private Boolean disponibilite;

@ManyToMany(mappedBy = "listterrain")
 List<joueur> listjoueur ;

 
 @ManyToOne
 private responsabledeterrain responsabledeterrain;
 

 
 public Integer getIdterrain() {
		return idterrain;
	}
	public void setIdterrain(Integer idterrain) {
		this.idterrain = idterrain;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public Integer getDistance() {
		return distance;
	}
	public void setDistance(Integer distance) {
		this.distance = distance;
	}
	public Integer getLongeur() {
		return longeur;
	}
	public void setLongeur(Integer longeur) {
		this.longeur = longeur;
	}
	public Boolean getDisponibilite() {
		return disponibilite;
	}
	public void setDisponibilite(Boolean disponibilite) {
		this.disponibilite = disponibilite;
	}


	public terrain(Integer idterrain, String place, Integer distance, Integer longeur, Boolean disponibilite) {
		super();
		this.idterrain = idterrain;
		this.place = place;
		this.distance = distance;
		this.longeur = longeur;
		this.disponibilite = disponibilite;
	}


	public terrain() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "terrain [idterrain=" + idterrain + ", place=" + place + ", distance=" + distance + ", longeur=" + longeur
				+ ", disponibilite=" + disponibilite + "]";
	}



	public List<joueur> getListjoueur()
	{
		return listjoueur;
	}


	public void setListjoueur(List<joueur> listjoueur)
	{
		
	this.listjoueur =listjoueur;

	}




	public responsabledeterrain getresponsabledeterrain() {
		return responsabledeterrain;


	}
	public void setreponsabledeterrain(responsabledeterrain responsabledeterrain) {
		// TODO Auto-generated method stub
		this.responsabledeterrain=responsabledeterrain;
	}


}