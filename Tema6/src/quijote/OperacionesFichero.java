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
			String escritura = "En un lugar de la Mancha, de cuyo nombre no quiero acordarme, no ha mucho tiempo que vivía un hidalgo de los de lanza en astillero, adarga antigua, rocín flaco y galgo corredor. Una olla de algo más vaca que carnero, salpicón las más noches, duelos y quebrantos los sábados, lentejas los viernes, algún palomino de añadidura los domingos, consumían las tres partes de su hacienda. El resto della concluían sayo de velarte, calzas de velludo para las fiestas con sus pantuflos de lo mismo, los días de entre semana se honraba con su vellori de lo más fino. Tenía en su casa una ama que pasaba de los cuarenta, y una sobrina que no llegaba a los veinte, y un mozo de campo y plaza, que así ensillaba el rocín como tomaba la podadera. Frisaba la edad de nuestro hidalgo con los cincuenta años, era de complexión recia, seco de carnes, enjuto de rostro; gran madrugador y amigo de la caza. Quieren decir que tenía el sobrenombre de Quijada o Quesada (que en esto hay alguna diferencia en los autores que deste caso escriben), aunque por conjeturas verosímiles se deja entender que se llama Quijana; pero esto importa poco a nuestro cuento; basta que en la narración dél no se salga un punto de la verdad.";
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