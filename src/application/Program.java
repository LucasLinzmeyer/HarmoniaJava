package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] escalaCromatica = new String[12];
		int intervaloPrimeiraNota = 0;

		escalaCromatica[0] = "C"; // 1º - +2
		escalaCromatica[1] = "C#";
		escalaCromatica[2] = "D"; // 2º - +2
		escalaCromatica[3] = "D#";
		escalaCromatica[4] = "E"; // 3º - +1
		escalaCromatica[5] = "F"; // 4º - +2
		escalaCromatica[6] = "F#";
		escalaCromatica[7] = "G"; // 5º - +2
		escalaCromatica[8] = "G#";
		escalaCromatica[9] = "A"; // 6º - +2
		escalaCromatica[10] = "A#";
		escalaCromatica[11] = "B";// 7º - +1
		
		int semiTom = (+1);
		int tom = (+2);

		System.out.println("A escalaCromatica possui " + escalaCromatica.length + " elementos.");
		System.out.println("--------------------------------------------------");

		System.out.printf("Digite a nota da escala: ");
		String primeiraNota = sc.nextLine();
		
		ArrayList<String> escala = new ArrayList<>();

		for (int i = 0; i <= 11; i++) {
			
			if(escalaCromatica[i].equals(primeiraNota)) {
				intervaloPrimeiraNota = Arrays.asList(escalaCromatica).indexOf(primeiraNota) + 1;
			}
		}
		
		int grau = Arrays.asList(escalaCromatica).indexOf(primeiraNota);
		
		System.out.println("A nota " + primeiraNota + " pertence a " + grau + "° elemento da escalaCromatica.");
		System.out.println("--------------------------------------------------");
		
		
		for(int i = escala.size(); i <= 6; i++) {
				
			if(escala.size() == 0) {
				int primeiroParaSegundo = grau;
				escala.add(escalaCromatica[primeiroParaSegundo]);
				grau += tom;
			}
				
			if(escala.size() == 1) {
				
				int segundoParaTerceiro = grau;
				
				if(segundoParaTerceiro <= 11) {
					escala.add(escalaCromatica[segundoParaTerceiro]);
					grau += tom;
					i++;
				} else if (grau == 12) {
					segundoParaTerceiro = 0;
					grau = 0;
					escala.add(escalaCromatica[segundoParaTerceiro]);
					grau += tom;
					i++;
				} else if (grau == 13) {
					segundoParaTerceiro = 1;
					grau = 1;
					escala.add(escalaCromatica[segundoParaTerceiro]);
					grau += tom;
					i++;
				}
				
			}
			
			if(escala.size() == 2) {
				int terceiroParaQuarto = grau;
				
				if(terceiroParaQuarto <= 11) {
					escala.add(escalaCromatica[terceiroParaQuarto]);
					grau += semiTom;
					i++;
				} else if (grau == 12) {
					terceiroParaQuarto = 0;
					grau = 0;
					escala.add(escalaCromatica[terceiroParaQuarto]);
					grau += semiTom;
					i++;
				} else if (grau == 13) {
					terceiroParaQuarto = 1;
					grau = 1;
					escala.add(escalaCromatica[terceiroParaQuarto]);
					grau += semiTom;
					i++;
				}
			}
			
			if(escala.size() == 3) {
				
				int quartoParaQuinto = grau;
				
				if(quartoParaQuinto <= 11) {
					escala.add(escalaCromatica[quartoParaQuinto]);
					grau += tom;
				} else if (grau == 12) {
					quartoParaQuinto = 0;
					grau = 0;
					escala.add(escalaCromatica[quartoParaQuinto]);
					grau += tom;
					i++;
				} else if (grau == 13) {
					quartoParaQuinto = 1;
					grau = 1;
					escala.add(escalaCromatica[quartoParaQuinto]);
					grau += tom;
					i++;
				}
			}
			
			if(escala.size() == 4) {
				
				int quintoParaSexto = grau;
				
				if(quintoParaSexto <= 11) {
					escala.add(escalaCromatica[quintoParaSexto]);
					grau += tom;
					i++;
				} else if (grau == 12) {
					quintoParaSexto = 0;
					grau = 0;
					escala.add(escalaCromatica[quintoParaSexto]);
					grau += tom;
					i++;
				} else if (grau == 13) {
					quintoParaSexto = 1;
					grau = 1;
					escala.add(escalaCromatica[quintoParaSexto]);
					grau += tom;
					i++;
				}
			}
			
			if(escala.size() == 5) {
				
				int sextoParaSetimo = grau;
				
				if(sextoParaSetimo <= 11) {
					escala.add(escalaCromatica[sextoParaSetimo]);
					grau += tom;
					i++;
				} else if (grau == 12) {
					sextoParaSetimo = 0;
					grau = 0;
					escala.add(escalaCromatica[sextoParaSetimo]);
					grau += tom;
					i++;
				} else if (grau == 13) {
					sextoParaSetimo = 1;
					grau = 1;
					escala.add(escalaCromatica[sextoParaSetimo]);
					grau += tom;
					i++;
				}
			}
			
			if(escala.size() == 6) {
				
				int setimoParaOitava = grau;
				
				if(setimoParaOitava <= 11) {
					escala.add(escalaCromatica[setimoParaOitava]);
					grau += semiTom;
					i++;
				} else if (grau == 12) {
					setimoParaOitava = 0;
					grau = 0;
					escala.add(escalaCromatica[setimoParaOitava]);
					grau += semiTom;
					i++;
				} else if (grau == 13) {
					setimoParaOitava = 1;
					grau = 1;
					escala.add(escalaCromatica[setimoParaOitava]);
					grau += semiTom;
					i++;
				}
			}
		}
	
		
		int n = escala.size();
		
		System.out.println("Número de graus da escala: " + n);
		System.out.println("--------------------------------------------------");
		System.out.println("Escala maior de " + primeiraNota + ":");
		
	    for (int i = 0; i < n; i++) {
	      System.out.printf("%dº Intervalo: %s\n", (i + 1), escala.get(i));
	    }
		
		sc.close();
	}

}
