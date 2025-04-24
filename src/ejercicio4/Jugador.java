package ejercicio4;

import java.util.List;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementWrapper;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

//Creamos la clase Jugador y Colocamos las etiquetas en los lugares correspondientes.
@XmlRootElement(name="Jugador")
@XmlType(propOrder={"jugador","armas","pociones"})
@XmlAccessorType(XmlAccessType.FIELD)
public class Jugador {
	@XmlAttribute(name ="Jugador")
	private String jugador;
	@XmlElementWrapper(name="ListaDeArmas")
	@XmlElement(name="Armas")
	private List<String> armas;
	@XmlElementWrapper(name="ListaDePociones")
	@XmlElement(name="Pociones")
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
