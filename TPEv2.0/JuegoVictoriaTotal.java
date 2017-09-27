
public class JuegoVictoriaTotal extends Juego {
	public JuegoVictoriaTotal(String nombreJ1, String nombreJ2){
		super(nombreJ1, nombreJ2);
	}
	
	private boolean montoVacio(Mazo monto){
		if(monto.estaVacioElMazo()){
			return true;
		}
		return false;
	}
	
	public void jugar(){		
		while(montoVacio(jugadorEnTurno.getMazo())){
			//jugar hasta que el perdedor se queda sin cartas
		}
	}
}
