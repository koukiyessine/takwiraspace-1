package tn.yassin.spring.entities;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;



@Entity
public class filee {
	
@OneToOne(mappedBy = "file")
private joueur joueur;
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

private Integer idfilee;
private String typefilee;
private String title;
@Column(length = 42000000)
private Byte[] tailleFile;

public joueur getJoueur() {
	return joueur;
}
public void setJoueur(joueur joueur) {
	this.joueur = joueur;
}


public Integer getIdfilee() {
	return idfilee;
}
public void setIdfilee(Integer idfilee) {
	this.idfilee = idfilee;
}
public String getTypefilee() {
	return typefilee;
}
public void setTypefilee(String typefilee) {
	this.typefilee = typefilee;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public Byte[] getTailleFile() {
	return tailleFile;
}
public void setTailleFile(Byte[] tailleFile) {
	this.tailleFile = tailleFile;
}
@Override
public String toString() {
	return "filee [  idfilee=" + idfilee + ", typefilee=" + typefilee + ", title=" + title
			+ ", tailleFile=" + Arrays.toString(tailleFile) + "]";
}
public filee( Integer idfilee, String typefilee, String title,
		Byte[] tailleFile) {
	super();
	this.idfilee = idfilee;
	this.typefilee = typefilee;
	this.title = title;
	this.tailleFile = tailleFile;
}


public filee() {
	super();
	// TODO Auto-generated constructor stub
}


public filee(String originalFilename, String contentType, byte[] compressBytes) {
	// TODO Auto-generated constructor stub
}




}
