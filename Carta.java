
public class Carta {
	private AtrCarta detalles = new AtrCarta();
	private String nombre;
	
	Carta(){}
	
	Carta(String nombre, AtrCarta detalles){
		this.nombre = nombre;
		this.detalles.clone(detalles); 
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public void mostrarCarta(){
		System.out.println("nombre: " + nombre);
		detalles.mostrarDetalles();
	}
}
