package bitImagen;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Angela {
	public static void main(String[] args)throws IOException  {
		int contador = 0;
		int array[] = new int[78592];
		try {
			FileInputStream imagen_leer = new FileInputStream(
					"C:/Users/jorge/Desktop/programas/angela.jpg");

			boolean final_im = false;

			while (!final_im) {
				int byte_entrada = imagen_leer.read();
				
				if (byte_entrada != -1) {
					array[contador] = byte_entrada;
					contador++;
				}
				else{
					final_im = true;
				}
				System.out.println(array[contador]);
				System.out.println(contador);
			}
			Angela.crea_imagen(array);
			imagen_leer.close();
		} catch (IOException e) {

		}
	}
	static void crea_imagen(int array[]) {

		try {
			FileOutputStream imagen_escritura = new FileOutputStream(
					"C:/Users/jorge/Desktop/programas/COPIAangela.jpg");

			for (int i = 0; i < array.length; i++) {
				imagen_escritura.write(array[i]);
			}
			
			imagen_escritura.close();
		} catch (IOException e) {
			System.out.println("No se copia la imagen");

		}
	}

}