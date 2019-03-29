package recepcionObjDvd;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import serializacion.Alumno;

public class Recepcion {

	public static void main(String[] args) {
		try{
		
			ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("C:/Users/jorge/Downloads/AlumnoCopia.obj"));
			Alumno laris=(Alumno)entrada.readObject();
			entrada.close();
			
			System.out.println(laris.getnombre());
			
		}catch(IOException | ClassNotFoundException e){
			e.printStackTrace();
	}

}
}
