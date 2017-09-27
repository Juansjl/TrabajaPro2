
public class JuegoPorRondas extends Juego{
	
	private int cantRondas;
	
	public JuegoPorRondas(String nombreJ1, String nombreJ2, int cantRondas){
		super(nombreJ1, nombreJ2);
		definirCantRondas(cantRondas);
	}
	
	public void definirCantRondas(int n){
		cantRondas = n;
	}
	
	public void jugar(){
		for(int ronda = 0; ronda < cantRondas; ronda++){
			
		}
		
		System.out.println("El ganador es: "); //a donde apunta jugadorEnTurno? o definimos un metodo que nos devuelva el ganador?
	}
	
	
}
