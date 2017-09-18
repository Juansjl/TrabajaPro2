import java.util.Scanner;

public class Juego {
private static Jugador j1 = new Jugador();
private static Jugador j2 = new Jugador();
private static Mazo m1 = new Mazo();
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		listarMenu();
		menu();
	}
	
	public static void menu(){
		Scanner sc = new Scanner(System.in);
		System.out.print("*.Ingrese la opcion: ");	
		int opc = sc.nextInt();
		while (opc != 0){
			switch(opc){
				case -1:
					listarMenu();			
				break;					
				case 1:
					
				break;
				case 3:
					m1.cargarTransformers();
				break;
				case 4:
					m1.cargarMinions();
				break;
				case 5:
					m1.listarMazos();
				break;
			}
			System.out.print("*.Ingrese la opcion: ");
			opc = sc.nextInt();
			System.out.println("-------------------------");
		}
		System.out.print("Adios");	
	}
	
	public static void listarMenu(){
		System.out.println("1-Crear Mazo");
		System.out.println("2-Borrar Mazo");
		System.out.println("3-Cargar Mazo Transformers");
		System.out.println("4-Cargar Mazo Minions");
		System.out.println("5-Listar TODOS los Mazos");
		System.out.println("8-Partida normal");
		System.out.println("9-Partida por rondas");
		
		
		System.out.println("0-Salir");
		System.out.println("-1.Menu");
		System.out.println("-------------------------");
	}
	
}