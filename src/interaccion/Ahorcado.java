package interaccion;

import java.util.Scanner;

public class Ahorcado {
	public static void main(String[] args) {
		Integer a = 0;
		Integer b = 0;
		Integer opcion;
		Integer resultado = 0;

		Scanner teclado = new Scanner(System.in);

		do {
			System.out.println(
					"Ingrese su operación /n 1 para sumar /n 2 para restar /n 3 para multiplicar /n 4 para dividir");
			opcion = teclado.nextInt();

			System.out.println("Ingrese el primer numero");
			a = teclado.nextInt();
			System.out.println("Ingrese el segundo numero");
			b = teclado.nextInt();

			switch (opcion) {
			case 4:
				resultado = a + b;
				break;
			case 3:
				resultado = a - b;
				break;
			case 2:
				resultado = a * b;
				break;
			case 1:
				resultado = a / b;
				break;
			}

		} while (opcion < 1 && opcion > 4);

		System.out.println("El resultado es " + resultado.toString());
	}
}
