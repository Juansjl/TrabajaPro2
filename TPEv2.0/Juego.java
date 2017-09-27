
public abstract class Juego {
	protected Mazo mazo;
	protected Jugador jugador1;
	protected Jugador jugador2;
	
	final static int MINATR;
	final static int MAXATR;
	
	
	//otra forma puede ser un constructor sin parametros y luego hacer un setJugador()
	public Juego(String nombreJ1, String nombreJ2){
		MINATR = 3;
		MAXATR = 6;
		jugador1 = new Jugador(nombreJ1);
		jugador2 = new Jugador(nombreJ2);		
	}
	
	//----JUGAR----
	
	public abstract void jugar();
	
	public void determinarGanador(){
		
	}
	
	
	//----CREACION DE MAZO----
	
	public void crearMazo(String nombreMazo, int cantCartas){
		mazo = new Mazo(nombreMazo);
	}
	
	public void crearCarta(String nombreCarta){
		Carta nuevaCarta = new Carta(nombreCarta);
		mazo.addCarta(nuevaCarta);
	}
	
	//----IMPRIMIR MAZO----
	
	public void mostrarMazo(){
		mazo.imprimirMazo();
	}
	
}
