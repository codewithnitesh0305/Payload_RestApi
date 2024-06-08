package com.springboot.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.Entity.Payload;
import com.springboot.Service.PayloadServiceImp;

@RestController
@RequestMapping("/api")
public class HomeController {

	@Autowired
	private PayloadServiceImp serviceImp;
	
	@PostMapping("/load")
	public ResponseEntity<?> savePayload(@RequestBody Payload payload){
		Payload savePayload = serviceImp.savePayload(payload);
		return new ResponseEntity<Payload>(savePayload,HttpStatus.CREATED);
	}
	
	@GetMapping("/load/{id}")
	public ResponseEntity<?> getPayloadById(@PathVariable int id){
		Payload payload = serviceImp.getPayloadById(id);
		return new ResponseEntity<Payload>(payload,HttpStatus.FOUND);
	}
	
	@GetMapping("/load")
	public ResponseEntity<?> getAllPayload(){
		List<Payload> list = serviceImp.getAllPayload();
		return new ResponseEntity<List<Payload>>(list,HttpStatus.FOUND);
	}
	
	@PutMapping("/load/{id}")
	public ResponseEntity<?> updatePayload(@PathVariable int id, @RequestBody Payload payload){
		payload.setId(id);
		Payload updatePayload = serviceImp.updatePayload(payload);
		return new ResponseEntity<Payload>(updatePayload, HttpStatus.OK);
	}
}
