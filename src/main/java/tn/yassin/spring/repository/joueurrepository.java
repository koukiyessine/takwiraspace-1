package tn.yassin.spring.repository;




import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import tn.yassin.spring.entities.joueur;

public interface joueurrepository extends CrudRepository<joueur, Integer>{
	
	boolean existsBynom(String nom);
	
	@Query(value="select * from joueur j where j.nom like :cle%",nativeQuery = true )
	List <joueur> getalljoueurbynom(@Param("cle") String nom);



@Query(value="select * from  joueurterrain  where idterrain=?1",nativeQuery= true)
List<Long> getidjoueurbyidterrainsaisi(Long idt);


/*
@Query(value="select * from  joueurterrain  where idterrain=?1",nativeQuery= true)
 List<joueur> findjoueurbyidterrain(Long idt);

*/

}

