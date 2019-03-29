package quijote;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class OperacionesFichero {
	static FileWriter fw;
	static FileReader fr;
	static BufferedReader br;
	static BufferedWriter bw;
	static String fichero = "C:/Users/jorge/Desktop/programas/Quijote.txt";
	static String fichLine = "C:/Users/jorge/Desktop/programas/QuijoteLineas.txt";

	public static void escribir() {
		try {
			
			fw = new FileWriter(fichero);
			String escritura = "En un lugar de la Mancha, de cuyo nombre no quiero acordarme, no ha mucho tiempo que viv�a un hidalgo de los de lanza en astillero, adarga antigua, roc�n flaco y galgo corredor. Una olla de algo m�s vaca que carnero, salpic�n las m�s noches, duelos y quebrantos los s�bados, lentejas los viernes, alg�n palomino de a�adidura los domingos, consum�an las tres partes de su hacienda. El resto della conclu�an sayo de velarte, calzas de velludo para las fiestas con sus pantuflos de lo mismo, los d�as de entre semana se honraba con su vellori de lo m�s fino. Ten�a en su casa una ama que pasaba de los cuarenta, y una sobrina que no llegaba a los veinte, y un mozo de campo y plaza, que as� ensillaba el roc�n como tomaba la podadera. Frisaba la edad de nuestro hidalgo con los cincuenta a�os, era de complexi�n recia, seco de carnes, enjuto de rostro; gran madrugador y amigo de la caza. Quieren decir que ten�a el sobrenombre de Quijada o Quesada (que en esto hay alguna diferencia en los autores que deste caso escriben), aunque por conjeturas veros�miles se deja entender que se llama Quijana; pero esto importa poco a nuestro cuento; basta que en la narraci�n d�l no se salga un punto de la verdad.";
			for (int i = 0; i < escritura.length(); i++) {
				fw.write(escritura.charAt(i));
			}
			fw.close();
		} catch (Exception e) {
			System.out.println("Error: Fichero no encontrado");
			System.out.println(e.getMessage());
		}
	}

	public static void leer() {
		try {
			fw = new FileWriter(fichLine);
			BufferedWriter bw = new BufferedWriter(fw);
			fr = new FileReader(fichero);
			int c = 0;

			while (c != -1) {
				c = fr.read();
				bw.write(c);
				if (c == ';' || c == '.' || c == ',') {
					bw.newLine();
				}

				System.out.print((char) c);
			}
			bw.flush();
			fw.close();
			fr.close();

		} catch (Exception e) {
			System.out.println("Error: Fichero no encontrado");
			System.out.println(e.getMessage());
		}
	}

	public static void leerLineas() {
		String linea = null;
		try {
			fr = new FileReader(fichLine);
			br = new BufferedReader(fr);
			linea = br.readLine();

			while (linea != null) {
				System.out.println(linea);
				linea = br.readLine();
			}

			fr.close();

		} catch (Exception e) {
			System.out.println("Error: Fichero no encontrado");
			System.out.println(e.getMessage());
		}
	}

}