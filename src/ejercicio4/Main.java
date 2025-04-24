package ejercicio4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

public class Main {
	
	public static void main(String[] args) {
		//Creamos la clase jugador con sus respectivos atributos.
		List<String> armas = new ArrayList<>();
		List<String> pociones = new ArrayList<>();
		armas.add("espada");
		armas.add("arco");
		armas.add("escudo");
		pociones.add("curación");
		pociones.add("daño");
		pociones.add("velocidad");
		
		Jugador j = new Jugador("El Jugador",armas,pociones);
		//Creamos un JAXBcontext.
		JAXBContext contexto;
		//Usamos Marshaller para escribir en el ficheroJugador.xml.
		try {
			contexto = JAXBContext .newInstance (Jugador.class);
			Marshaller m = contexto. createMarshaller();
			m.setProperty (Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE) ;
			
			m.marshal (j, new FileWriter("Jugador.xml"));
			System.out.println("Fichero escrito");
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
		e.printStackTrace();
		}

		
		

	}

}
