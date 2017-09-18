import java.util.HashMap;
 
public class AtrCarta {
	private final int CANTATRMIN = 3;
	private final int CANTATRMAX = 6;
	private HashMap<String, Double> mapAtr = new HashMap<String, Double>();
	
	AtrCarta(){
		
	}
	
	public HashMap<String, Double> getAtr(){
		return mapAtr;
	}
	
	public void AgregarAtr(String nombreAtr, Double valor){
		mapAtr.put(nombreAtr, valor);
	}
	
	public boolean estaEnelRango(){
		return ((mapAtr.size() >= CANTATRMIN) && (mapAtr.size() <= CANTATRMAX)); 
	}
	
	public void mostrarDetalles(){
		for(String atr : mapAtr.keySet()){
			System.out.println(atr + ": " + mapAtr.get(atr));
		}
	}
	
	
	public void clone(AtrCarta detalles){//Esto esta RE MAL!!!
		HashMap<String, Double> mapAtrCopia = detalles.getAtr();
		for(String key : mapAtrCopia.keySet()){
			mapAtr.put(key, mapAtrCopia.get(key));
		}
	}
	
}
