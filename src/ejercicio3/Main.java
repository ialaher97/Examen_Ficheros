package ejercicio3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.google.gson.*;

public class Main {

	public static void main(String[] args) {
		//Creamos un Gson
		Gson gson = new Gson();
		
	
	//Leemos el fichero jugador.json.
	BufferedReader br = null;
	//Creamos un String que mostrara cada linea y un String vacío donde añadiremos cada línea.
	try {
		br = new BufferedReader(new FileReader("jugador.json"));
		String linea = br.readLine();
		String vacio = "";
		while(linea != null) {
			vacio += linea;
			linea = br.readLine();
		}
		//Finalmente creamos una Jugador y le introducimos los parámetros ("String",class). Y mostramos por consola.
		Jugador j= gson.fromJson(vacio, Jugador.class);
		System.out.println(j);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	

	}

}
