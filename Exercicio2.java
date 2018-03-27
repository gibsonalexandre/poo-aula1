package aula1;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Quantos anos vc tem?");
		int numero = scanner.nextInt();
		
		//verifica a idade, se for maior que 30 imprime "vc é velho!"
		if(numero > 30)
			System.out.println("vc é velho!");
		//verifica a idade, se for menor que 15 imprime "vc é novo!"
		if(numero < 15)
			System.out.println("vc é novo!");
	}
}
