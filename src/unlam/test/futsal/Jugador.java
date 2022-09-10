package unlam.test.futsal;

public class Jugador {

	private Double precio;
	private Integer edad;
	private String nombreJugador;
	private Integer numeroCamiseta;
	

	public Jugador(Double precio, Integer edad, String nombreJugador, Integer numeroCamiseta) {
		this.precio = precio;
		this.edad = edad;
		this.nombreJugador = nombreJugador;
		this.numeroCamiseta = numeroCamiseta;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getNombreJugador() {
		return nombreJugador;
	}

	public void setNombreJugador(String nombreJugador) {
		this.nombreJugador = nombreJugador;
	}

	public Integer getNumeroCamiseta() {
		return numeroCamiseta;
	}

	public void setNumeroCamiseta(Integer numeroCamiseta) {
		this.numeroCamiseta = numeroCamiseta;
	}

	@Override
	public String toString() {
		return "Jugador [precio=" + precio + ", edad=" + edad + ", nombreJugador=" + nombreJugador + ", numeroCamiseta="
				+ numeroCamiseta + "]";
	}

	
	
	
	
	
	
	
	
	
}
