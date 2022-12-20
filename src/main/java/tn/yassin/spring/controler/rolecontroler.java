package tn.yassin.spring.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tn.yassin.spring.entities.role;
import tn.yassin.spring.service.irole;

@RestController
public class rolecontroler {
	
	@Autowired
	irole srol;
	
	@PostMapping("/addrole")
	public role addrole(@RequestBody role rl)
	{
	return srol.addrole(rl); 	
	}

}
