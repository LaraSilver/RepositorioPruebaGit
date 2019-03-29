package ficheros;

import java.io.FileReader;
import java.io.FileWriter;

public class EscrituraBorrado {
	public static void main(String[] args) {
		FileWriter w = null;
		String fichero = "C:/Users/jorge/Desktop/prueba.txt";
		try {
			w = new FileWriter(fichero, false);
			String nuevo = "\r\nFederico García Lorca, Vuelta de Paseo.";
			for (int i = 0; i < nuevo.length(); i++) {
				w.write(nuevo.charAt(i));
			}
			w.close();

			FileReader fr = new FileReader(fichero);
			int caract = fr.read();

			while (caract != -1) {
				System.out.print((char) caract);
				caract = fr.read();
			}
			w.close();
		} catch (Exception e) {
			System.out.println("Error: Fichero no encontrado");
			System.out.println(e.getMessage());

		}
	}
}