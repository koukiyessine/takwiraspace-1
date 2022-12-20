package tn.yassin.spring.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.yassin.spring.entities.responsabledeterrain;
import tn.yassin.spring.entities.terrain;
import tn.yassin.spring.repository.responsabletrepository;
import tn.yassin.spring.repository.terrainrepository;






@Service
public class serviceterrain implements iterrain {

@Autowired
terrainrepository terrainrep;
@Autowired
responsabletrepository responsablerep;
	
	
	@Override
	public terrain addterrainrep(terrain tr, Integer idresponsable) {
     responsabledeterrain rdt=responsablerep.findById(idresponsable).get();	
	   tr.setreponsabledeterrain(rdt);	
		return terrainrep.save(tr);
	}


	@Override
	public List<terrain> allterrain() {
		// TODO Auto-generated method stub
		return (List<terrain>) terrainrep.findAll();   
	}


	@Override
	public void deleteterrain(Integer idterrain) {
		// TODO Auto-generated method stub
		
		terrainrep.deleteById(idterrain);
		
	}


	@Override
	public terrain updateterrain(terrain tr, Integer idterrain) {
          terrain trt=terrainrep.findById(idterrain).get();
          trt.setPlace(tr.getPlace());
          trt.setDistance(tr.getDistance());
		return terrainrep.save(trt);
	}


	@Override
	public terrain findbyplace(String place) {
		// TODO Auto-generated method stub
		return terrainrep.findByplace(place);
	}


	@Override
	public List<terrain> listterrainbyidresponsable(Integer idresponsable) {
		
	responsabledeterrain rdt=responsablerep.findById(idresponsable).get(); 
		
		return  terrainrep.findByresponsabledeterrain(rdt);
	}


	@Override
	public responsabledeterrain getresponsablefromidterrain(Integer idterrain) {
		// TODO Auto-generated method stub
		
		terrain trr=terrainrep.findById(idterrain).get();
		
		
		return  trr.getresponsabledeterrain();
	}


	
	@Override
	public String afficherterrainexiste(Integer idterrain) {
String ch="";
if(terrainrep.existsByidterrain(idterrain)) 

	ch="cette id existe dans table";
else
	ch="ni pas existe dans bd";

return ch;	
	}


	@Override
	public List<terrain> addlistterrain(List<terrain> tr) {
		// TODO Auto-generated method stub
		return (List<terrain>) terrainrep.saveAll(tr);
	}



	
	

	
	
	
	}
	



