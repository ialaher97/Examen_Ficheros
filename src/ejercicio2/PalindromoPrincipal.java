package ejercicio2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PalindromoPrincipal {

	public static void main(String[] args) {
		//Creamos un mapa que contendrá la información de el fichero palindromo txt.
		//y creamos 2 arrays uno para palabras y otro para frases.
		Map<String,String[]> palindromos = new HashMap<>();
		String[] frases = new String[0];
		String[] palabras = new String[0];
		
		//Leemos el fichero
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader("palindromo.txt"));
			String linea = br.readLine();
			while(linea!=null) {
				//Separamos cada palabra de la linea por espacios y lo almacenamos en un Array.
				//Si la longitud del Array es igual a 1 es una palabra y se añadirá la línea al array de palabras
				//Si la longitud es mayor se añadira la linea al Array de frases.
				String[] array = linea.split(" ");
				if(array.length == 1) {
					String[] aux = Arrays.copyOf(palabras, palabras.length+1);
					aux[aux.length-1]=linea;
					palabras = aux;
				}else {
					String[] aux1 = Arrays.copyOf(frases, frases.length+1);
					aux1[aux1.length-1]=linea;
					frases = aux1;
					
				}
				linea=br.readLine();
				//Creamos la clave palabra y frase y añadimos el array a su correspondiente clave.
				palindromos.put("palabra", palabras);
				palindromos.put("frase", frases);
			}
			System.out.println("Arrays creados");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//Cerramos br.
			if(br != null) {
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		System.out.println(Arrays.toString(palindromos.get("frase")));
		System.out.println(Arrays.toString(palindromos.get("palabra")));
	}

}
