import java.util.Vector;

public class Jugador {
	private String name;
	private Vector<Carta> mazo;

	public Jugador(String name){
		this.name = name;
		mazo = new Vector<Carta>();
	}

	//esto nomas para poner un mensaje onda "gano Pancho" xD
	public String getName(){
		return name;
	}

	/*
		Ademas, jugador cuenta con los metodos de Vector:

		add() //para añadir cartas al mazo cuando se reparten las cartas entre jugadores o cuando gana la ronda y gana la carta del oponente
		removeElementAt() //para eliminar la carta en caso de perder la ronda
		isEmpty() //si se queda sin cartas, termina la partida y pierde
	*/
}
