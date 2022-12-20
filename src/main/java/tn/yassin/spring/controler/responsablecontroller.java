package tn.yassin.spring.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tn.yassin.spring.entities.responsabledeterrain;
import tn.yassin.spring.service.responsabletservice;

@RestController
public class responsablecontroller {

@Autowired
responsabletservice rts;
	
	@PostMapping("/addrespontr")
	public responsabledeterrain addrespontr(@RequestBody responsabledeterrain rdt) {
		
		return rts.addrespontr(rdt);

}
	
}
