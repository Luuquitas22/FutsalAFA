package unlam.test.futsal;

import java.util.ArrayList;
import java.util.List;

public class Torneo {

	List<Partido> listaDePartidos;
	
	public Torneo() {
		listaDePartidos = new ArrayList<>();
	}

	public void registrarNuevoPartido(Partido nuevoPartido) {
		listaDePartidos.add(nuevoPartido);
		
	}
	
	public Partido buscarPartidoPorId(Integer id) {
		
		for (Partido partido : listaDePartidos) {
			if(partido.getIdPartido().equals(id)) {
				return partido;
			}
		}
		
		return null;
	}
	
	
	
	
}
