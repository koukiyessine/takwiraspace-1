package tn.yassin.spring.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import tn.yassin.spring.entities.joueur;

public interface Ijoueur {
	
	public joueur addjoueur (joueur j);
	public List<joueur> addlistjoueur(List<joueur> lu);
	public String addjoueurwtnp(joueur j);
	public String addjoueurwtex(joueur jo);
	public joueur updatejoueur(joueur j ,Integer id );
	public void supprimerjoueur(Integer  id);
	public List<joueur> getalljoueur();
	public List<joueur> getalljoueurbynom(String ch);
	public joueur addjoueurterrain(Integer idjoueur,Integer idterrain);
	public List<Long> listidjoueurbyidterrainsaisi(Long idt);
	public List<joueur> findjoueurbyidterrain(Integer idt);
	public joueur addjoueurfile(Integer idjoueur  , MultipartFile filee );

	
	

}
