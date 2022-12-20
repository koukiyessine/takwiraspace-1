package tn.yassin.spring.service;

import java.util.List;

import tn.yassin.spring.entities.responsabledeterrain;
import tn.yassin.spring.entities.terrain;

public interface iterrain {

	
public terrain addterrainrep(terrain tr , Integer idresponsable);	

public List<terrain> allterrain();

public List<terrain> addlistterrain(List<terrain> tr);

public void deleteterrain(Integer idterrain);


public terrain updateterrain(terrain tr ,Integer idterrain);

public terrain findbyplace(String place);

public List<terrain> listterrainbyidresponsable(Integer idresponsable);

public String afficherterrainexiste(Integer idterrain);

public responsabledeterrain getresponsablefromidterrain(Integer idterrain);









}


