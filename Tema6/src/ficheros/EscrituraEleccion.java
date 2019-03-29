package ficheros;

import java.util.Scanner;

public class EscrituraEleccion {
	public static void main(String[] args) {
		int variable, aux = 1;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Vas a escribir un fichero.");

		do {
			System.out
					.print("¿Qué vas a hacer? \n 1.Sobrescribir \n 2.Escribir a continuación");
			variable = teclado.nextInt();
			switch (variable) {
			case 1:
				Eleccion.Sobre();
				System.out
						.println("Pulse 1 para continuar y cualquier otra tecla para finalizar");
				variable = teclado.nextInt();
				if (aux != 1) {
					aux = 2;
				}
				break;
			case 2:
				Eleccion.Escri();
				System.out
						.println("Pulse 1 para continuar y cualquier otra tecla para finalizar");
				variable = teclado.nextInt();
				if (aux == 1) {
					aux = 2;
				}
				break;
			}

		} while (aux == 1);
	}
}
