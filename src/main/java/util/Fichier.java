package util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;

public class Fichier {

	public Fichier() {
		
	}
	public String loadFileXML() {
		
		try {
				
			Resource resource = new DefaultResourceLoader().getResource("smallCV.xml");
	        if (!resource.exists()) {
	            return "Le fichier spécifié n'existe pas.";
	        }
	
	       
	        InputStream inputStream = resource.getInputStream();
	        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
	
	        StringBuilder content = new StringBuilder();
	        String line;
	        while ((line = reader.readLine()) != null) {
	            content.append(line).append("\n");
	        }
	        reader.close();
	
	        return content.toString();
	        
	    } catch (IOException e) {
	        return "Erreur lors de la lecture du fichier : " + e.getMessage();
	    }
	}
}
	
