package unlam.test.futsal;

public class Evento {

	
	private Integer numeroDeEvento;
	private Integer minuto;
	private Jugador jugadorDelEvento;
	private TipoEvento eventoRegistrado;
	

	public Evento(Integer numeroDeEvento, TipoEvento eventoRegistrado, Integer minuto, Jugador jugadorDelEvento) {
		this.numeroDeEvento = numeroDeEvento;
		this.minuto = minuto;
		this.eventoRegistrado = eventoRegistrado;
		this.jugadorDelEvento = jugadorDelEvento;
		
	}

	public Integer getNumeroDeEvento() {
		return numeroDeEvento;
	}

	public void setNumeroDeEvento(Integer numeroDeEvento) {
		this.numeroDeEvento = numeroDeEvento;
	}

	public Integer getMinuto() {
		return minuto;
	}

	public void setMinuto(Integer minuto) {
		this.minuto = minuto;
	}
	
	public Jugador getJugadorDelEvento() {
		return jugadorDelEvento;
	}

	public TipoEvento getEventoRegistrado() {
		return eventoRegistrado;
	}

	public void setEventoRegistrado(TipoEvento eventoRegistrado) {
		this.eventoRegistrado = eventoRegistrado;
	}
	
	@Override
	public String toString() {
		return "Evento [numeroDeEvento=" + numeroDeEvento + ", minuto=" + minuto + ", jugadorDelEvento="
				+ jugadorDelEvento + ", eventoRegistrado=" + eventoRegistrado  + "]";
	}
	
	
	
}
