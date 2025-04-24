package ejercicio3;

import java.util.List;
//Creamos el Objeto Jugador con sus correspondientes atributos, los getters y setters, los constructores y el metodo toString.
public class Jugador {
	private String jugador;
	private List<String> armas;
	private List<String> pociones;
	public String getJugador() {
		return jugador;
	}
	public void setJugador(String jugador) {
		this.jugador = jugador;
	}
	public List<String> getArmas() {
		return armas;
	}
	public void setArmas(List<String> armas) {
		this.armas = armas;
	}
	public List<String> getPociones() {
		return pociones;
	}
	public void setPociones(List<String> pociones) {
		this.pociones = pociones;
	}
	public Jugador(String jugador, List<String> armas, List<String> pociones) {
		super();
		this.jugador = jugador;
		this.armas = armas;
		this.pociones = pociones;
	}
	public Jugador() {
		super();
	}
	@Override
	public String toString() {
		return "Jugador [jugador=" + jugador + ", armas=" + armas + ", pociones=" + pociones + "]";
	}
	
	
	
	

}
