package tn.yassin.spring.controler;




import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tn.yassin.spring.entities.responsabledeterrain;
import tn.yassin.spring.entities.terrain;
import tn.yassin.spring.service.serviceterrain;



@RestController
public class terraincontroler {

	@Autowired
	serviceterrain servter;
	

	
	@PostMapping("/addterrainrep/{idr}")
	public terrain addterrain(@RequestBody  terrain tr,@PathVariable("idr") Integer idresponsable) {
	
	return servter.addterrainrep(tr, idresponsable);
		
}
	@GetMapping("/allterrain")

	public List<terrain> allterrain() {
		return servter.allterrain();
		
		
	}

	
	@DeleteMapping("/deleteterrain/{idt}")

	public void deleteterrain(@PathVariable("idt") Integer idterrain) {

       servter.deleteterrain(idterrain);	
		System.out.println("les delete de terrain est success !!");

}	
	
 @PostMapping("/updateterrain/{idt}")
	public terrain updateterrain(@RequestBody  terrain tr,@PathVariable("idt") Integer idterrain) {

return servter.updateterrain(tr, idterrain);	
	
	
}
 
    @GetMapping("/findbyplace/{pl}")
	public terrain findbyplace(@PathVariable("pl")  String place) {

 return servter.findbyplace(place);
 
}
    
    @GetMapping("/listterrainbyidresponsable/{idr}")

	public List<terrain> listterrainbyidresponsable(@PathVariable("idr")Integer idresponsable) {
		return servter.listterrainbyidresponsable(idresponsable);
		
	}

    @GetMapping("/getresponsablefromidterrain/{idt}")
	public responsabledeterrain getresponsablefromidterrain(@PathVariable("idt")   Integer idterrain) {

	
	return servter.getresponsablefromidterrain(idterrain);
}
@GetMapping("/afficherterrainexiste/{idt}")	
	public String afficherterrainexiste(@PathVariable("idt")Integer idterrain) {
            
    return servter.afficherterrainexiste(idterrain);
}

@PostMapping("/addlistterrain")
public List<terrain> addlistterrain(@RequestBody List<terrain> tr) {
	return servter.addlistterrain(tr);
}



}