package defazio.tutorials.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import defazio.tutorials.demo.dto.AutoreDto;
import defazio.tutorials.demo.dto.EagerLibroDto;
import defazio.tutorials.demo.dto.LibroDto;
import defazio.tutorials.demo.service.AutoreService;
import defazio.tutorials.demo.service.LibroService;
import defazio.tutorials.demo.service.WelcomeService;

@RequestMapping("api/v1")
@org.springframework.web.bind.annotation.RestController
public class RestController {
	 private LibroService libroService;

	    private AutoreService autoreService;

	    private WelcomeService welcomeService;

	    public RestController(WelcomeService welcomeService) {
	        this.welcomeService = welcomeService;
	    }

	    @Autowired
	    public void setLibroService(LibroService libroService) {
	        this.libroService = libroService;
	    }
	    @Autowired
	    public void setAutoreService(AutoreService autoreService) {
	        this.autoreService = autoreService;
	    }

	
	
	@GetMapping({"/autore/{autoreId}"})
	ResponseEntity<AutoreDto> getAutore(@PathVariable Long autoreId){
		
		return new ResponseEntity<>(autoreService.getAutoreDto(autoreId),HttpStatus.OK);
	}
	@GetMapping({"/fatautore/{autoreId}"})
	ResponseEntity<AutoreDto> getAutoreFat(@PathVariable Long autoreId){
		
		return new ResponseEntity<>(autoreService.getFatAutoreDto(autoreId),HttpStatus.OK);
	}
	@GetMapping({"/libro/{libroId}"})
	ResponseEntity<LibroDto> getLibro(@PathVariable Long libroId){
		
		return new ResponseEntity<>(libroService.getLibroDto(libroId),HttpStatus.OK);
	}
	@GetMapping({"/fatlibro/{libroId}"})
	ResponseEntity<EagerLibroDto> getLibroFat(@PathVariable Long libroId){
		
		return new ResponseEntity<>(libroService.getFatLibroDto(libroId),HttpStatus.OK);
	}
}
