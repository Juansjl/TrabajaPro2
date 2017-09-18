import java.util.ArrayList;
import java.util.HashMap;

public class Mazo extends Carta{
	private static int id = 0;
	
	private HashMap<String, Mazo> listaMazos = new HashMap<String, Mazo>();
	private ArrayList<Carta> listaCartas = new ArrayList<Carta>();
	
	Mazo(){}
	
	Mazo(String nombre){
		id++;
		listaMazos.put(nombre, this);
	}
	
	public ArrayList<Carta> getListaCartas(){
		return listaCartas;
	}
	
	public boolean existeMazo(String nombre){
	  return listaMazos.containsKey(nombre);
	}
	
	public boolean existeCarta(String nombre){
		boolean respuesta = false;
		if(!listaCartas.isEmpty()){
			for(Carta aCart : listaCartas){
				if(nombre == aCart.getNombre()){
					respuesta = true;
					continue;
				}
			}
			return respuesta;
		}else{return respuesta;}
	}
	
	public void agregarCarta(Carta aCart){
		if(existeCarta(aCart.getNombre())){
			System.out.println("Ya existe la carta: " + aCart.getNombre());
		}else
		listaCartas.add(aCart);	
	}
	
	public void cargarMinions(){
		if(!existeMazo("Minions")){
			Carta aCart;
			String nombre = "Banana! Banana!";
			Mazo aDeck = new Mazo("Minions");
			AtrCarta detalles = new AtrCarta();
			detalles.AgregarAtr("valentia", new Double(5));
			detalles.AgregarAtr("liderazgo", new Double(31));
			detalles.AgregarAtr("ternura", new Double(88));
			aCart = new Carta(nombre, detalles);
			aDeck.agregarCarta(aCart);
			
			nombre = "Serving the pharaoh!";
			detalles = new AtrCarta();
			detalles.AgregarAtr("valentia", new Double(8));
			detalles.AgregarAtr("liderazgo", new Double(50));
			detalles.AgregarAtr("ternura", new Double(55));
			aCart = new Carta(nombre, detalles);
			aDeck.agregarCarta(aCart);
			
			nombre = "Stranded in Snow!";
			detalles = new AtrCarta();
			detalles.AgregarAtr("valentia", new Double(6));
			detalles.AgregarAtr("liderazgo", new Double(25));
			detalles.AgregarAtr("ternura", new Double(40));
			aCart = new Carta(nombre, detalles);
			aDeck.agregarCarta(aCart);
			
			listaMazos.put("Minions", aDeck);
		}else{System.out.println("El mazo de Minions ya existe");}
	}
	
	public void cargarTransformers(){
		if(!existeMazo("Transformers")){
			Carta aCart;
			String nombre = "A1";
			Mazo aDeck = new Mazo("Transformers");
			AtrCarta detalles = new AtrCarta();
			detalles.AgregarAtr("altura", new Double(7.10));
			detalles.AgregarAtr("peso", new Double(12.000));
			detalles.AgregarAtr("fuerza", new Double(1000.000));
			detalles.AgregarAtr("peleas ganadas", new Double(900));
			detalles.AgregarAtr("velocidad", new Double(230));
			aCart = new Carta(nombre, detalles);
			aDeck.agregarCarta(aCart);
			
			nombre = "A2";
			detalles = new AtrCarta();
			detalles.AgregarAtr("altura", new Double(3.30));
			detalles.AgregarAtr("peso", new Double(1.200));
			detalles.AgregarAtr("fuerza", new Double(560.000));
			detalles.AgregarAtr("peleas ganadas", new Double(125));
			detalles.AgregarAtr("velocidad", new Double(275));
			aCart = new Carta(nombre, detalles);
			aDeck.agregarCarta(aCart);
			
			nombre = "A3";
			detalles = new AtrCarta();
			detalles.AgregarAtr("altura", new Double(4.20));
			detalles.AgregarAtr("peso", new Double(1.050));
			detalles.AgregarAtr("fuerza", new Double(850.000));
			detalles.AgregarAtr("peleas ganadas", new Double(880));
			detalles.AgregarAtr("velocidad", new Double(175));
			aCart = new Carta(nombre, detalles);
			aDeck.agregarCarta(aCart);
			
			listaMazos.put("Transformers", aDeck);
		}else{System.out.println("El mazo de Minions ya existe");}
	}
	
	public void listarMazos(){
		if(!listaMazos.isEmpty()){
			for(String nombreMazo : listaMazos.keySet()){
				System.out.println("*.-" + nombreMazo);
				System.out.println();
				Mazo aDeck = listaMazos.get(nombreMazo);
				for(Carta aCart : aDeck.getListaCartas()){
					aCart.mostrarCarta();
					System.out.println();
				}
			}
		}else{System.out.println("No existe ningun mazo.");} 
			
	}
	
	
}
