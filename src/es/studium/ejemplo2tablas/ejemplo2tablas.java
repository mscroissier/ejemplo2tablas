package es.studium.ejemplo2tablas;

import java.util.Scanner;

public class ejemplo2tablas {

	public static void main(String[] args) {
		final int TAM = 5;
		int i;
		int tabla[] = new int [TAM];
		Scanner teclado = new Scanner(System.in);
		for (i=0;i<TAM;i++)
		{
			System.out.println ("dame un numero de la tabla["+i+"]");
			tabla[i] = teclado.nextInt();
		}
		teclado.close();
		for(i=0;i<TAM;i++)
		{
			System.out.println(tabla[i]);
		}
	}
}
