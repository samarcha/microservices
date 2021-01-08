package com.esprit.microservice;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping(value = "/api/pub")
public class PubliciteRestAPI {
	
	
private String title="Hello , I'm the publicite Microservice";
	
    @Autowired
	private PubliciteService publiciteService;

	
	/*@RequestMapping("/hello")
	public String sayHello() {
		System.out.println(title);
		
		return title;
	}*/

    @GetMapping("/employees")
	  List<Publicite> all() {
	    return publiciteService.fetchAll();
	  }
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Publicite> createPublicite(@RequestBody Publicite publicite) {
		return new ResponseEntity<>(publiciteService.addPublicite(publicite), HttpStatus.OK);
	}
	
	
	@PutMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Publicite> updatePublicite(@PathVariable(value = "id") int id,
    										@RequestBody Publicite publicite){
		return new ResponseEntity<>(publiciteService.updatePublicite(id, publicite), HttpStatus.OK);
	}
	
	
	@DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<String> deletePublicite(@PathVariable(value = "id") int id){
		return new ResponseEntity<>(publiciteService.deletePublicite(id), HttpStatus.OK);
	}
}
