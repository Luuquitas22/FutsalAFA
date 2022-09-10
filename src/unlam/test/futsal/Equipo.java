package unlam.test.futsal;

import java.util.ArrayList;
import java.util.List;

public class Equipo {

	List<Jugador> listaJugadores;
	
	
	public Equipo() {
		
		listaJugadores = new ArrayList<>();	
	}


	public void agregarJugadorAlEquipo(Jugador jugador) {
		listaJugadores.add(jugador);
		
	}

	public Jugador buscarJugadorPorPrecio(Double precio) {
		for (Jugador jugador : listaJugadores) {
			if(jugador.getPrecio().equals(precio)) {
				return jugador;
			}
		}
		return null;
	}

	public Double calcularValorDelEquipo() {
		Double totalPrecioJugadores = 0.0;
	
		for (Jugador jugador : listaJugadores) {
			totalPrecioJugadores += jugador.getPrecio();
		}
		return totalPrecioJugadores;	
	}


	public Integer calcularEdadPromedioDeLosJugadores(Integer cantidadJuadoresDelClub) {
		Integer totalEdadJugadores = 0 ;
		
		for (Jugador jugador : listaJugadores) {
			totalEdadJugadores += jugador.getEdad();
		}
		
		return totalEdadJugadores / cantidadJuadoresDelClub;
	}
	
	
	
	
	
	
	
	
}
