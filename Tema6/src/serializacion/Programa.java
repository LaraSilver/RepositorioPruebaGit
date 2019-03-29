package serializacion;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Array;

public class Programa implements Serializable {
	public static void main(String[] args) {
		Alumno alu = new Alumno();
		try{
		
			ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("C:/Users/jorge/Desktop/programas/serial.obj"));
			salida.writeObject(alu);
			salida.close();
			
			
			ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("C:/Users/jorge/Desktop/programas/serial.obj"));
			Alumno laris=(Alumno)entrada.readObject();
			entrada.close();
			
			System.out.println(laris.getnombre());
			
		}catch(IOException | ClassNotFoundException e){
			e.printStackTrace();
		}
		//segundo ejercicio
		Alumno[] clase = new Alumno[5];
		
		for(int i=0; i<clase.length;i++){
			clase[i]=new Alumno("Holis","Adios");
		}
		
		try {
			ObjectOutputStream fuera = new ObjectOutputStream(new FileOutputStream("C:/Users/jorge/Desktop/programas/serialarray.obj"));
			ObjectInputStream dentro = new ObjectInputStream(new FileInputStream("C:/Users/jorge/Desktop/programas/serialarray.obj"));
			
			fuera.writeObject(clase);
			Alumno[] david = (Alumno[]) dentro.readObject();
			
			for (Alumno deivid : david) {
				System.out.println(deivid.getnombre());
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		File archivo= new File ("C:/Users/jorge/Desktop/programas/serialarray.obj");
		File judia= new File ("bin");
		File direc = new File("nuevoDirectorio");
		
		
		if (archivo.exists()){
			System.out.println("El archivo existe!!!");
			if(archivo.isDirectory()){
				System.out.println("Es un directorio");
			}else{
				System.out.println("Es un archivo");
			}
			
		}else{
			System.out.println("El archivo NO existe");
		}
		System.out.println(archivo.getAbsolutePath());

		String[] array = judia.list();
		
		for (String lista : array) {
			System.out.println(lista);
		}
		
		direc.mkdir();
		
	}
}