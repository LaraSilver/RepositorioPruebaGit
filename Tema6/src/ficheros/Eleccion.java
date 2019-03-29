package ficheros;
import java.io.FileWriter;
import java.util.Scanner;

public class Eleccion {
	static FileWriter w = null;
	static String fichero = "C:/Users/jorge/Desktop/programas/fichero.txt";
	static String ficheroSobre="C:/Users/jorge/Desktop/programas/ficheroSobre.txt";
	static String auxiliar;
	static int variable;
	static Scanner teclado = new Scanner(System.in);

	public static void Sobre(){
		try{
			w = new FileWriter(ficheroSobre, false);
			System.out.println("Introduce la frase que vas a añadir");
			teclado.nextLine();
			auxiliar = teclado.nextLine();
			for (int i = 0; i < auxiliar.length(); i++) {
				w.write(auxiliar.charAt(i));
			}
			w.close();
			System.out.println("Fichero sobreescrito");	
			
		}catch(Exception e) {
			System.out.println("Error: Fichero no encontrado");
			System.out.println(e.getMessage());
		}
			
	}
	public static void Escri(){
	try {
		w = new FileWriter(fichero, true);
		System.out.println("Introduce la frase que vas a añadir");
		teclado.nextLine();
		auxiliar = teclado.nextLine();
		for (int i = 0; i < auxiliar.length(); i++) {
			w.write("\n");
			w.write(auxiliar.charAt(i));
		}
		w.close();
		System.out.println("linea añadida");
	}catch(Exception e) {
		System.out.println("Error: Fichero no encontrado");
		System.out.println(e.getMessage());
	}
	}
}
