package tn.yassin.spring.controler;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;






@RestController
public class testcontroller {
	
@GetMapping("/test") 
public String hello()
{
return "hello";	     
}
}
