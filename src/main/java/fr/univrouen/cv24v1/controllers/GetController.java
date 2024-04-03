package fr.univrouen.cv24v1.controllers;

import java.io.FileReader;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import util.Fichier;

@RestController
public class GetController {
	
	@GetMapping("/resume")
	public String getListCVinXML() {
		
		return "Envoi de la liste des CV";
		
	}
	
	@GetMapping("/cvid")
	public String getCVinXML(
			
	@RequestParam(value = "texte") String texte) {
		
		return ("Détail du CV n° " + texte);
	
	}
	
	
	@GetMapping("/toto")
	public String getCVToto() {
		
		return "Toto";
	
	}
	
	@GetMapping("/test")
	public String testMethod(
	        @RequestParam(value = "id") int id,
	        @RequestParam(value = "titre") String titre) {
	    return "Test :\n" +
	           "id = " + id + "<br>"  +
	           "titre = " + titre;
	}

	@GetMapping("/testfic")
	public String getCVString() {
		 Fichier fichier = new Fichier();
		 String content = fichier.loadFileXML();
	     return content;
	
	}
}