package com.gokul.quickblood.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gokul.helloWorld.model.GeneratedMessage;
import com.gokul.quickblood.Dto.Query;
import com.gokul.quickblood.model.Donar;
import com.gokul.quickblood.repo.DonarRepository;

@RestController
@RequestMapping("/")
@CrossOrigin
public class DonarRestController {
	
	@Autowired
	DonarRepository repo;

	
	@PostMapping(value="/donar")
	public Donar saveDonarDetails(@RequestBody Donar donar) {
		return repo.save(donar);
	}
	
	@GetMapping(value="/donar/{bloodgroup}/{location}")
	public List<Donar> getDonarDetails(@PathVariable Map<String,String> pathVariables) {
		return repo.findAllByBloodgroupAndLocation(pathVariables.get("bloodgroup"),pathVariables.get("location"));
	}
	
	@GetMapping(value="/alldonar")
	public List<Donar> getAllDonars(){
		return repo.findAll();
	}
	
//	@GetMapping("/helloworld1/{code}")
//	public GeneratedMessage generateMessage(@PathVariable String code){
//		return new GeneratedMessage(String.format("hello gokul %s",code ));
//	}
//	@GetMapping("/helloworld")
//	public String message() {
//		return "helloworld"; 
//	}
}
	

		
	

