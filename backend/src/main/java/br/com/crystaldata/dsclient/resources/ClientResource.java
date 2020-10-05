package br.com.crystaldata.dsclient.resources;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.crystaldata.dsclient.entities.Client;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {
	
	@GetMapping
	public ResponseEntity<List<Client>> findAll(){
	List<Client>list = new ArrayList<>();
	list.add(new Client(1L, "Alex", "01234578900", 2000.00, Instant.now(), 1));
	list.add(new Client(1L, "Bob", "03434578900", 3000.00, Instant.now(), 3));
	return ResponseEntity.ok().body(list);
	}
}
