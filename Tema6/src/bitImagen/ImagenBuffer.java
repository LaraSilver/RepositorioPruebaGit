package bitImagen;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImagenBuffer {
	public static void main(String[] args) throws IOException {
		String imEntrada = "C:\\Users\\jorge\\Desktop\\programas\\Safo.jpg";
		String imSalida = "C:\\Users\\jorge\\Desktop\\programas\\CopiaSafo.jpg";
		FileInputStream stEntrada = new FileInputStream(imEntrada);
		FileOutputStream stSalida = new FileOutputStream(imSalida);
		BufferedInputStream bflector = new BufferedInputStream(stEntrada);
		BufferedOutputStream bfescritor = new BufferedOutputStream(stSalida);

		int leido = 0;
System.out.println("Empieza");
		try {
			while ((leido = bflector.read()) != -1) {
				bfescritor.write(leido);
			}
			bflector.close();
			bfescritor.close();
		} catch (IOException e) {

		}
		System.out.println("Hecho");
	}
}
