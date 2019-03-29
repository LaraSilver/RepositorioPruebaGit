package ficheros;

import java.io.FileReader;
import java.util.ArrayList;

public class Lectura {
	public static void buscar(ArrayList<Character> a) {
		char c;
		int A = 0, E = 0, I = 0, O = 0, U = 0;
			for (int x = 0; x < a.size(); x++) {
				c=a.get(x);
				if (c == 'a' || c == 'A') {
					A++;
				}
				if (c == 'e' || c == 'E') {
					E++;
				}
				if (c == 'i' || c == 'I') {
					I++;
				}
				if (c == 'o' || c == 'O') {
					O++;
				}
				if (c == 'u' || c == 'U') {
					U++;
				}
		}
		int total = (A + E + I + O + U);
		System.out.println("");
		System.out.println("Tienes " + total + " vocales");
		System.out.println("De las cuales:");
		System.out.println(A + " son aes");
		System.out.println(E + " son ees");
		System.out.println(I + " son ies");
		System.out.println(O + " son oes");
		System.out.println(U + " son ues");
	}

	public static void main(String args[]) {
		String fichero = "C:/Users/jorge/Desktop/prueba.txt";
		FileReader fr;
		ArrayList<Character> leer = new ArrayList<Character>();
		try {
			fr = new FileReader(fichero);
			int caract = fr.read();

			while (caract != -1) {
				System.out.print((char) caract);
				caract = fr.read();
				leer.add((char) caract);
			}
			System.out.println("");
			Lectura.buscar(leer);
			fr.close();

		} catch (Exception e) {
			System.out.println("Error: Fichero no encontrado");
			System.out.println(e.getMessage());
		}
	}

}

