import java.util.ArrayList;

public class Mazo{
	private String nombre;
	private ArrayList <Carta> lista;
	
	public Mazo(String name){
		nombre = name;
		lista = new ArrayList <Carta>();		
	}
	
	public int cantCartas(){
		return lista.size();
	}
	
	public void addCarta(Carta card){
		if(validarCarta(card)){
			lista.add(card);
		}
	}
	
	//devolver copia de la carta, no originao ARREGLAR
	public Carta getTop(){
		return lista.get(0);
		
	}
	
	public void removeTop(){
		lista.remove(0);
	}
	
	public void addBot(Carta card){
		lista.add(card);
	}
	
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
}
