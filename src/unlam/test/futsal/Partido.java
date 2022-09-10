package unlam.test.futsal;

import java.util.ArrayList;
import java.util.List;

public class Partido {

	private Integer idPartido;
	private List<Evento> listaEventos;
	
	
	public Partido(Integer idPartido, Equipo equipoLocal, Equipo equipoVisitante) {
		this.idPartido = idPartido;
		listaEventos = new ArrayList<>();
	}

	public Integer getIdPartido() {
		return idPartido;
	}

	public void setIdPartido(Integer idPartido) {
		this.idPartido = idPartido;
	}

	public void registrarNuevoEvento(Evento nuevoEvento) {
		listaEventos.add(nuevoEvento);
		
	}
	
	public Evento buscarEventoPorNumero (Integer numeroEvento) {
		Evento eventoABuscar = new Evento(0, null,0, null);
		
		for (Evento evento : listaEventos) {
			if(evento.getNumeroDeEvento().equals(numeroEvento)) {
				eventoABuscar = evento;
			}
		}
		
		return eventoABuscar; 
	}

	public Jugador buscarJugadorDelEvento(Integer numeroEvento) {
		Jugador jugadorABuscar = new Jugador(0.0,0,"",0);
		
		for (Evento evento : listaEventos) {
			if(evento.getNumeroDeEvento().equals(numeroEvento)) {
			jugadorABuscar = evento.getJugadorDelEvento();
			}
		}
		return jugadorABuscar;
	}

	public Integer buscarMinutoDelEvento(Integer numeroEvento) {
		Integer minutoDelEventoABuscar = 0;
		
		for (Evento evento : listaEventos) {
			if(evento.getNumeroDeEvento().equals(numeroEvento)) {
			minutoDelEventoABuscar = evento.getMinuto();
			}
		}
		return minutoDelEventoABuscar;
	}

	public TipoEvento buscarTipoDeEventoDelPartido(Integer numeroEvento) {
		TipoEvento eventoABuscar = null;
		
		for (Evento evento : listaEventos) {
			if(evento.getNumeroDeEvento().equals(numeroEvento)) {
			eventoABuscar = evento.getEventoRegistrado();
			}
		}
		
		return eventoABuscar;
	}
	
	
	public TipoEvento expulsarJugadorPorDobleAmarrilla(Integer numeroEvento1, Integer numeroEvento2, Integer
			numeroDeEventoExpulsion) {
		TipoEvento expulsion = TipoEvento.EXPULSION_DOBLE_AMONESTACION;
		TipoEvento amonestacion = TipoEvento.AMONESTACIÓN;
		
		if(this.buscarTipoDeEventoDelPartido(numeroEvento1) == amonestacion &&
		   this.buscarTipoDeEventoDelPartido(numeroEvento2) == amonestacion  ) {
			return expulsion;
		}
		
		return null; 
	}

	public void mostrarResultadoFinal() {
		for (Evento evento : listaEventos) {
			System.out.println(evento);
		}
		
	}

	@Override
	public String toString() {
		return "Partido [idPartido=" + idPartido + ", listaEventos=" + listaEventos + "]";
	}
	
	
	
	
	
}
