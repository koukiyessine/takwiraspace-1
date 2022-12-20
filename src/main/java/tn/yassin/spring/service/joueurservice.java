package tn.yassin.spring.service;

import java.io.IOException;
//import java.io.IOException;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import tn.yassin.spring.entities.filee;
import tn.yassin.spring.entities.joueur;
import tn.yassin.spring.entities.terrain;
import tn.yassin.spring.repository.joueurrepository;
import tn.yassin.spring.repository.terrainrepository;

@Service
public class joueurservice  implements Ijoueur{

	@Autowired
	joueurrepository joueurrep;
	@Autowired
	terrainrepository terrainrep;
	@Autowired
	fileeservice fsrv;
	@Override
	public joueur addjoueur(joueur j) {
		// TODO Auto-generated method stub
		return joueurrep.save(j);
		
	}
	
	@Override
	public List<joueur> addlistjoueur(List<joueur> lu) {
		// TODO Auto-generated method stub
		return (List<joueur>) joueurrep.saveAll(lu);
	}

	@Override
	public String addjoueurwtnp(joueur j) {
		// TODO Auto-generated method stub
		
		String ch="";
		if(j.getNom().equals(j.getPrenom()))
		{
			joueurrep.save(j);		
	     	ch="les test devient ajouter !!!";
	}
		else
			ch="cette equals  est  differente";
		return ch;
	}

	@Override
	public String addjoueurwtex(joueur jo) {
		// TODO Auto-generated method stub
		
		String ch="";
		
		if(joueurrep.existsBynom(jo.getNom()))
		{
			ch="les nom existe dans bd";
		}
		else
		{
			ch="nom devient ajouter";
			joueurrep.save(jo);
		}
		return ch;
	}

	@Override
	public joueur updatejoueur(joueur j, Integer id) {
		// TODO Auto-generated method stub
	      
		joueur jo=joueurrep.findById(id).get();
		 jo.setNom(j.getNom());
		 
		 joueurrep.save(jo);
		return jo;
	}

	@Override
	public void supprimerjoueur(Integer id) {
		
		joueurrep.deleteById(id);
		
	}
	
	

	@Override
	public List<joueur> getalljoueur() {
		// TODO Auto-generated method stub
		return (List<joueur>) joueurrep.findAll();
	}

	

	@Override
	public List<joueur> getalljoueurbynom(String ch) {
		// TODO Auto-generated method stub
		return joueurrep.getalljoueurbynom(ch);
	}

	@Override
	public joueur addjoueurterrain(Integer idjoueur, Integer idterrain) {
		joueur jo=joueurrep.findById(idjoueur).get();
		terrain tr=terrainrep.findById(idterrain).get();
		jo.addterrain(tr);
		
		
	
	return joueurrep.save(jo);	
	}
	

	
	
	
	@Override
	public List<Long> listidjoueurbyidterrainsaisi(Long idt) {
		 List<Long> listjoueur=joueurrep.getidjoueurbyidterrainsaisi(idt);
	return listjoueur;
	}
	
	@Override
	public List<joueur> findjoueurbyidterrain(Integer idt) {

		terrain tr=terrainrep.findById(idt).get();
		
		return tr.getListjoueur();
	}


	
	
	public joueur addjoueurfile(Integer idjoueur  , MultipartFile filee ) {
	
		joueur j=joueurrep.findById(idjoueur).get();
	       
	       try {
			filee f=fsrv.uploadfile(filee);
		    j.setFile(f);      

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	       
	       
		return joueurrep.save(j)  ;
		
		
	}
	
	
}
