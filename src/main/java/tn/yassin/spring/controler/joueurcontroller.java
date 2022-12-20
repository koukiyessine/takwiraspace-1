package tn.yassin.spring.controler;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import tn.yassin.spring.entities.joueur;

import tn.yassin.spring.service.joueurservice;

@RestController
public class joueurcontroller {

@Autowired
joueurservice jservice;

@PostMapping("/addjoueur")
public joueur addjoueur (@RequestBody joueur j)
{
	return jservice.addjoueur(j);
}


@PostMapping("/addlistjoueur")
public List<joueur> addlistjoueur (@RequestBody List<joueur> li)
{
	return jservice.addlistjoueur(li);
}



@PostMapping("/addjoueurwtnp")
public String addjoueurwtnp (@RequestBody joueur j)
{
	return jservice.addjoueurwtnp(j);
}
 

@PostMapping("/addjoueurwtex")
public String addjoueurwtex (@RequestBody joueur j)
{
	return jservice.addjoueurwtex(j);
}


@PostMapping("updatejoueur/{idjoueur}")
public joueur  updatejoueur (@RequestBody joueur j ,@PathVariable("idjoueur") Integer id)
{
	return jservice.updatejoueur(j, id);
}


@DeleteMapping("/supprimerjoueur")
public void supprimerjoueur(@PathParam("id") Integer id)
{
	 jservice.supprimerjoueur(id);
	
}


@GetMapping("/getalljoueur")
public List<joueur> getalljoueur()
{
	return jservice.getalljoueur();
}



@GetMapping("getalljoueurbynom/{nom}")
public List<joueur> getalljoueurbynom(@PathVariable("nom") String nom)
{
	return jservice.getalljoueurbynom(nom);
}

@PostMapping("/addjoueurterrain/{idj}/{idt}")
public joueur  addjoueur(@PathVariable("idj") Integer idjo ,@PathVariable("idt") Integer idte) {
	return jservice.addjoueurterrain(idjo, idte);
	
}




@GetMapping("/listidjoueurbyidterrainsaisi/{idt}")
public  List<Long> getidjoueurbyidterrainsaisi(@PathVariable("idt") Long idt){
return jservice.listidjoueurbyidterrainsaisi(idt);
}


@GetMapping("/findjoueurbyidterrainsaisi/{idt}")
public  List<joueur> getjoueurbyidterrainsaisi(@PathVariable("idt") Integer idt){
return jservice.findjoueurbyidterrain(idt);
}


@PostMapping("/addjoueurfile/{idj}")
public joueur addjoueurfile( @PathVariable("idj")  Integer idjoueur  ,@RequestParam MultipartFile filee ) {

return jservice.addjoueurfile(idjoueur, filee);
}





}
