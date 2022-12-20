package tn.yassin.spring.repository;



import java.util.List;

//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import tn.yassin.spring.entities.responsabledeterrain;
//import tn.yassin.spring.entities.responsabledeterrain;
import tn.yassin.spring.entities.terrain;

public interface terrainrepository  extends CrudRepository<terrain, Integer>{
	

	terrain findByplace(String place);
	
	boolean existsByidterrain(Integer idterrain);

	//@Query(value="select idterrain from terrain t join responsabledeterrain rt on t.terrain=rt.idterrain where idresponsable=?1",nativeQuery= true)
	 //List<terrain> listterrainbyidresponsable(Integer idresponsable); 


	List<terrain> findByresponsabledeterrain(responsabledeterrain rdt);

	
	

	



	
	

	

	


	
	
}






