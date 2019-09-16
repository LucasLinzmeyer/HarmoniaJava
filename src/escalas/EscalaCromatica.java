package escalas;

import java.util.Arrays;

public class EscalaCromatica {

	private String escalaCromatica[];

	public EscalaCromatica() {

		escalaCromatica = new String[12];
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

	}

	public String getEscalaCromatica(int indice) {
		return escalaCromatica[indice];
	}

	public int verificarGrau(String primeiraNota) {

		return Arrays.asList(escalaCromatica).indexOf(primeiraNota);

	}

	public boolean verificarNota(String primeiraNota) {
		
		for (int i = 0; i <= 11; i++) {
			
			if(escalaCromatica[i] == primeiraNota) {
				return true;
			}
		}
		return false;
	}
	
	public String getNota(int grau) {
		return escalaCromatica[grau];
	}
}
