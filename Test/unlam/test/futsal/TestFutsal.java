package unlam.test.futsal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class TestFutsal {
	
	@Test
	public void agregarJugadorAlEquipo() {
		
		Jugador jugador1 = new Jugador(2000.0,30,"Hernan",5);
		Jugador jugador2 = new Jugador(5000.0,18,"Crespo",20);
		Jugador jugador3 = new Jugador(3000.0,20,"Maradona",10);
		Jugador jugador4 = new Jugador(4000.0,28,"Messi",15);
		Jugador jugador5 = new Jugador(7000.0,26,"Pirlo",11);
		
		Equipo River = new Equipo();
		
		River.agregarJugadorAlEquipo(jugador1);
		
		assertEquals(jugador1 , River.buscarJugadorPorPrecio(2000.0) );
		
	}
	
	@Test
	public void calcularValorDelEquipoSumandoPrecioDeJugadoresDelEquipo() {
		
		Jugador jugador1 = new Jugador(2000.0,30,"Hernan",5);
		Jugador jugador2 = new Jugador(5000.0,18,"Crespo",20);
		Jugador jugador3 = new Jugador(3000.0,20,"Maradona",10);
		Jugador jugador4 = new Jugador(4000.0,28,"Messi",15);
		Jugador jugador5 = new Jugador(7000.0,26,"Pirlo",11);
		
		Equipo River = new Equipo();
		
		River.agregarJugadorAlEquipo(jugador1);
		River.agregarJugadorAlEquipo(jugador2);
		River.agregarJugadorAlEquipo(jugador3);
		River.agregarJugadorAlEquipo(jugador4);
		River.agregarJugadorAlEquipo(jugador5);
		
		Double valorEsperado = 21000.0;
		
		assertEquals(valorEsperado , River.calcularValorDelEquipo() );
		
	}
	
	@Test
	public void calcularEdadPromedioDeLosJugadoresDeUnEquipo() {
		
		Jugador jugador1 = new Jugador(2000.0,30,"Hernan",5);
		Jugador jugador2 = new Jugador(5000.0,18,"Crespo",20);
		Jugador jugador3 = new Jugador(3000.0,20,"Maradona",10);
		Jugador jugador4 = new Jugador(4000.0,28,"Messi",15);
		Jugador jugador5 = new Jugador(7000.0,26,"Pirlo",11);
		
		Equipo River = new Equipo();
		
		River.agregarJugadorAlEquipo(jugador1);
		River.agregarJugadorAlEquipo(jugador2);
		River.agregarJugadorAlEquipo(jugador3);
		River.agregarJugadorAlEquipo(jugador4);
		River.agregarJugadorAlEquipo(jugador5);
		
		Integer valorEsperado = 24;
		
		assertEquals(valorEsperado , River.calcularEdadPromedioDeLosJugadores(5) );
		
	}
	
	@Test
	public void queSePuedaRegistrarUnNuevoPartidoEnUnTorneo() {
		
		Jugador jugador1 = new Jugador(2000.0,30,"Hernan",5);
		Jugador jugador2 = new Jugador(5000.0,18,"Crespo",20);
		Jugador jugador3 = new Jugador(3000.0,20,"Maradona",10);
		Jugador jugador4 = new Jugador(4000.0,28,"Messi",15);
		Jugador jugador5 = new Jugador(7000.0,26,"Pirlo",11);
		
		Equipo River = new Equipo();
		Equipo Boca = new Equipo();
	
		Torneo torneoLocal = new Torneo();
		
		Partido nuevoPartido = new Partido(120, River, Boca);
		
		torneoLocal.registrarNuevoPartido(nuevoPartido);
		
		assertEquals(nuevoPartido, torneoLocal.buscarPartidoPorId(120));
		
	}
	
	@Test
	public void queSePuedaRegistrarUnNuevoEventoGolEnUnPartidoEnUnTorneo() {
		
		Jugador jugador1River = new Jugador(2000.0,30,"Prato",11);
		Jugador jugador2River = new Jugador(5000.0,18,"Montiel",4);
		Jugador jugador3River = new Jugador(3000.0,20,"Poncio",5);
		Jugador jugador4River = new Jugador(4000.0,28,"Casco",3);
		Jugador jugador5River = new Jugador(7000.0,26,"Armani",1);
		
		Equipo River = new Equipo();
		
		Jugador jugador1Boca = new Jugador(8000.0,30,"Julian",8);
		Jugador jugador2Boca = new Jugador(2000.0,18,"Riquelme",10);
		Jugador jugador3Boca = new Jugador(5000.0,20,"Garcia",15);
		Jugador jugador4Boca = new Jugador(6000.0,28,"Joaquin",32);
		Jugador jugador5Boca = new Jugador(9000.0,26,"Tevez",5);
		
		
		Equipo Boca = new Equipo();
	
		Torneo torneoLocal = new Torneo();
		
		Partido nuevoPartido = new Partido(120, River, Boca);
		
		TipoEvento gol = TipoEvento.GOL;
		Evento nuevoEvento = new Evento(145, gol, 85, jugador1River);
		
		nuevoPartido.buscarMinutoDelEvento(145);
		nuevoPartido.buscarJugadorDelEvento(145);
		
		nuevoPartido.registrarNuevoEvento(nuevoEvento);
		
		assertEquals(nuevoEvento, nuevoPartido.buscarEventoPorNumero(145));
		
	}
	
	@Test
	public void queSePuedaRegistrarUnNuevoEventoExpulsionDirectaEnUnPartidoDeUnTorneo() {
		
		Jugador jugador1River = new Jugador(2000.0,30,"Prato",11);
		Jugador jugador2River = new Jugador(5000.0,18,"Montiel",4);
		Jugador jugador3River = new Jugador(3000.0,20,"Poncio",5);
		Jugador jugador4River = new Jugador(4000.0,28,"Casco",3);
		Jugador jugador5River = new Jugador(7000.0,26,"Armani",1);
		
		Equipo River = new Equipo();
		
		Jugador jugador1Boca = new Jugador(8000.0,30,"Julian",8);
		Jugador jugador2Boca = new Jugador(2000.0,18,"Riquelme",10);
		Jugador jugador3Boca = new Jugador(5000.0,20,"Garcia",15);
		Jugador jugador4Boca = new Jugador(6000.0,28,"Joaquin",32);
		Jugador jugador5Boca = new Jugador(9000.0,26,"Tevez",5);
		
		
		Equipo Boca = new Equipo();
	
		Torneo torneoLocal = new Torneo();
		
		Partido nuevoPartido = new Partido(120, River, Boca);
		
		TipoEvento expulsion = TipoEvento.EXPULSION_DIRECTA;
		Evento nuevoEvento = new Evento(145, expulsion, 85, jugador1River);
		
		nuevoPartido.buscarMinutoDelEvento(145);
		nuevoPartido.buscarJugadorDelEvento(145);
		
		nuevoPartido.registrarNuevoEvento(nuevoEvento);
		
		assertEquals(nuevoEvento, nuevoPartido.buscarEventoPorNumero(145));
		
	}
	
	@Test
	public void queAlRegistrarDosEventosAmonestacionSeGenereUnEventoExpulsionPorAmonestacion() {
		
		Jugador jugador1River = new Jugador(2000.0,30,"Prato",11);
		Jugador jugador2River = new Jugador(5000.0,18,"Montiel",4);
		Jugador jugador3River = new Jugador(3000.0,20,"Poncio",5);
		Jugador jugador4River = new Jugador(4000.0,28,"Casco",3);
		Jugador jugador5River = new Jugador(7000.0,26,"Armani",1);
		
		Equipo River = new Equipo();
		
		Jugador jugador1Boca = new Jugador(8000.0,30,"Julian",8);
		Jugador jugador2Boca = new Jugador(2000.0,18,"Riquelme",10);
		Jugador jugador3Boca = new Jugador(5000.0,20,"Garcia",15);
		Jugador jugador4Boca = new Jugador(6000.0,28,"Joaquin",32);
		Jugador jugador5Boca = new Jugador(9000.0,26,"Tevez",5);
		
		
		Equipo Boca = new Equipo();
	
		Torneo torneoLocal = new Torneo();
		
		Partido nuevoPartido = new Partido(120, River, Boca);
		
		TipoEvento primeraAmarrilla = TipoEvento.AMONESTACIÓN;
		Evento nuevoEventoPrimeraAmarrila = new Evento(130, primeraAmarrilla, 60, jugador1River);
		
		nuevoPartido.buscarMinutoDelEvento(130);
		
		nuevoPartido.registrarNuevoEvento(nuevoEventoPrimeraAmarrila);
		
		
		TipoEvento segundaAmarrilla = TipoEvento.AMONESTACIÓN;
		Evento nuevoEventoSegundaAmarrila = new Evento(135, segundaAmarrilla, 60, jugador1River);
		
		nuevoPartido.buscarMinutoDelEvento(135);
		nuevoPartido.registrarNuevoEvento(nuevoEventoSegundaAmarrila);
		
		nuevoPartido.expulsarJugadorPorDobleAmarrilla(130,135,145);
		
	
		TipoEvento expulsion = TipoEvento.EXPULSION_DOBLE_AMONESTACION;
		Evento nuevoEventoExpulsionDobleAmarrilla = new Evento(145, expulsion, 85, jugador1River);
		
		nuevoPartido.buscarMinutoDelEvento(145);
		nuevoPartido.buscarJugadorDelEvento(145);
		
		nuevoPartido.registrarNuevoEvento(nuevoEventoExpulsionDobleAmarrilla);
		
		
		
		assertEquals(expulsion, nuevoPartido.expulsarJugadorPorDobleAmarrilla(130,135,145));
		
	}
	
	@Test
	public void verResumenDeUnPartidoEnUnTorneo() {
		
		Jugador jugador1River = new Jugador(2000.0,30,"Prato",11);
		Jugador jugador2River = new Jugador(5000.0,18,"Montiel",4);
		Jugador jugador3River = new Jugador(3000.0,20,"Poncio",5);
		Jugador jugador4River = new Jugador(4000.0,28,"Casco",3);
		Jugador jugador5River = new Jugador(7000.0,26,"Armani",1);
		
		Equipo River = new Equipo();
		
		River.agregarJugadorAlEquipo(jugador1River);
		River.agregarJugadorAlEquipo(jugador2River);
		River.agregarJugadorAlEquipo(jugador3River);
		River.agregarJugadorAlEquipo(jugador4River);
		River.agregarJugadorAlEquipo(jugador5River);
		
		Jugador jugador1Boca = new Jugador(8000.0,30,"Julian",8);
		Jugador jugador2Boca = new Jugador(2000.0,18,"Riquelme",10);
		Jugador jugador3Boca = new Jugador(5000.0,20,"Garcia",15);
		Jugador jugador4Boca = new Jugador(6000.0,28,"Joaquin",32);
		Jugador jugador5Boca = new Jugador(9000.0,26,"Tevez",5);
		
		
		Equipo Boca = new Equipo();
		
		Boca.agregarJugadorAlEquipo(jugador1Boca);
		Boca.agregarJugadorAlEquipo(jugador2Boca);
		Boca.agregarJugadorAlEquipo(jugador3Boca);
		Boca.agregarJugadorAlEquipo(jugador4Boca);
		Boca.agregarJugadorAlEquipo(jugador5Boca);
	
		Torneo torneoLocal = new Torneo();
		
		Partido nuevoPartido = new Partido(120, River, Boca);
		
		
		
		TipoEvento expulsion = TipoEvento.EXPULSION_DIRECTA;
		Evento nuevoEvento = new Evento(145, expulsion, 25, jugador1River);
		
		nuevoPartido.buscarMinutoDelEvento(145);
		nuevoPartido.buscarJugadorDelEvento(145);
		
		nuevoPartido.registrarNuevoEvento(nuevoEvento);
		
		TipoEvento golEquipoLocal = TipoEvento.GOL;
		Evento nuevoEventoGol = new Evento(185, golEquipoLocal, 35, jugador3River);
		
		nuevoPartido.buscarMinutoDelEvento(185);
		nuevoPartido.buscarJugadorDelEvento(185);
		
		nuevoPartido.registrarNuevoEvento(nuevoEventoGol);
		
		TipoEvento golEquipoLocal2 = TipoEvento.GOL;
		Evento nuevoEventoGol2 = new Evento(200, golEquipoLocal2, 40, jugador4River);
		
		nuevoPartido.buscarMinutoDelEvento(200);
		nuevoPartido.buscarJugadorDelEvento(200);
		
		nuevoPartido.registrarNuevoEvento(nuevoEventoGol2);
		
		
		TipoEvento golEquipoVisitante = TipoEvento.GOL;
		Evento nuevoEventoGolVisitante = new Evento(230, golEquipoVisitante, 40, jugador1Boca);
		
		nuevoPartido.buscarMinutoDelEvento(230);
		nuevoPartido.buscarJugadorDelEvento(230);
		
		nuevoPartido.registrarNuevoEvento(nuevoEventoGolVisitante);
		
		nuevoPartido.mostrarResultadoFinal();
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
