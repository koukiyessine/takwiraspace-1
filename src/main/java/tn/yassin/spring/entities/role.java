package tn.yassin.spring.entities;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class role {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long idrole;
@Enumerated(EnumType.STRING)
private erole namer;



public Long getIdrole() {
	return idrole;
}
public void setIdrole(Long idrole) {
	this.idrole = idrole;
}
public erole getNamer() {
	return namer;
}
public void setNamer(erole namer) {
	this.namer = namer;
}


public role(Long idrole, erole namer) {
	super();
	this.idrole = idrole;
	this.namer = namer;
}


public role() {
	super();
	// TODO Auto-generated constructor stub
}


@Override
public String toString() {
	return "role [idrole=" + idrole + ", namer=" + namer + "]";
}



}
