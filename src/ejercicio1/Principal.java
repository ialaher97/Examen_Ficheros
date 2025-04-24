package ejercicio1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		//Creamos una lista de  numero enteros y 3 variables int.
		
		List<Integer> numEnteros = new ArrayList<>();
		int nuevaPosicion = 0;
		int sumaEnteros = 0;
		int tamanioLista = (int) (Math.random() * 50);
		
		//Creamos un for para rellenar la lista de numeros enteros creados de manera aleatoria
		for (int i = 0; i < tamanioLista; i++) {
			int numAleatorio = (int) (Math.random() * 20);
			numEnteros.add(numAleatorio);
		}
		//Mostramos la lista
		System.out.println(numEnteros);
		
		//Si la longitud de la lista no es multiplo de 3 restaremos los números que sobran de la lista y restaremos el
		// numero de posiciones de la lista con el numero de numeros que sobran para encontrar la posición donde la lista sigue
		//siendo multiplo de 3.
		if (numEnteros.size() % 3 != 0) {
			int resto = 0;
			resto = numEnteros.size() % 3;
			nuevaPosicion = numEnteros.size() - resto;
			// Sumamos los números sobrantes
			for (int i = nuevaPosicion; i < numEnteros.size(); i++) {
				sumaEnteros += numEnteros.get(i);
			}
			System.out.println(sumaEnteros);
			
			// Creamos un BufferedWriter para escribir en el fichero
			BufferedWriter bw = null;
			//Escribimos en el fichero separando cada resultado con una , y ponemos en bw true para que no se borren los datos.
			try {
				bw = new BufferedWriter(new FileWriter("SumaDeNumerosEnteros.txt", true));
				bw.write(sumaEnteros + ", ");
				System.out.println("Fichero Escrito");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				if (bw != null) {
					try {
						//Cerramos bw
						bw.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}

	}

}
