package application;

import java.util.Scanner;

import escalas.Escala;
import escalas.EscalaCromatica;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);


		System.out.printf("Digite a nota da escala: ");
		
		String primeiraNota = sc.nextLine();
		
		primeiraNota = primeiraNota.toUpperCase();
		
		Escala escala = new Escala(primeiraNota);
		
		EscalaCromatica teste = new EscalaCromatica();
		
		
		
		System.out.println("A nota " + primeiraNota + " pertence a " + teste.verificarGrau(primeiraNota) + "ª posição da escalaCromatica.");
		System.out.println("----------------------------------------------------");
		
		escala.verEscala();
		
		
		
		sc.close();
	}

}