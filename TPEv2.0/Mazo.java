import java.util.ArrayList;

public class Mazo{
	private String nombre;
	private ArrayList <Carta> lista;
	
	public Mazo(String name){
		nombre = name;
		lista = new ArrayList <Carta>();		
	}
	
	//----CANTIDAD DE CARTAS QUE CONTIENE EL MAZO----
	
	public int cantCartas(){
		return lista.size();
	}
	
	//----AGREGAR CARTA AL MAZO----
	
	public void addCarta(Carta card){
		if(validarCarta(card)){
			lista.add(card);
		}
	}
	
	//----PREGUNTA SI ESTA VACIO EL MAZO----
	
	public boolean estaVacioElMazo(){
		if(lista.isEmpty()){
			return true;
		}
		return false;
	}
	
	//----DEVOLVER COPIA CARTA----
	
	public Carta getTop(){
		//creo una variable Carta c = new Carta();
		//seteo sus atributos con los mismos que el original
		//retorno "c" que sera una copia
		return lista.get(0);		
	}
	
	//----ELIMINAR LA CARTA JUGADA----
	
	public void removeTop(){
		lista.remove(0);
	}
	
	//----AGREGAR CARTAS GANADAS AL FONDO DEL MONTON----
	
	public void addBot(Carta card){
		lista.add(card);
	}
	
	//----VALIDACION DE CARTAS----
	
	private boolean validarCarta(Carta card){
		Carta top = lista.get(0);
		return (mismoCantAtr(top, card)) && (mismosAtr(top, card));
	}
	
	
	private boolean mismoCantAtr(Carta cartaMazo, Carta cartaNueva){
		return (cartaMazo.getCantAtr()) == (cartaNueva.getCantAtr());
	}
	
	//consultar si esta bien como lo hacemos aca
	private boolean mismosAtr(Carta cartaMazo, Carta cartaNueva){
		ArrayList <String> atributos = cartaMazo.getListaAtributos();
		for(int i = 0; i < atributos.size(); i++){
			if(!(existeElAtributo(atributos.get(i)))){
				return false;
			}
		}
		return true;
	}
	
	//----IMPRIMIR EL MAZO COMPLETO----
	
	public void imprimirMazo(){
		for(int i = 0; i < lista.size(); i++){
			System.out.println(lista.get(i).getNombre());
			for(int j = 0; j < lista.get(i).getCantAtr(); j++){
				System.out.println(lista.get(i).getAtributo(j)); //hacer un metodo en carta que con un foreach devuelva el atributo en la posicion indicada
			}
		}
	}
	
	
}
