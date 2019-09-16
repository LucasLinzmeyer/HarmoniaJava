package escalas;

import java.util.ArrayList;

public class Escala extends EscalaCromatica {
	
	private String primeiraNota;
	private int grau;
	private int semiTom = (+1);
	private int tom = (+2);
	ArrayList<String> escala;
	
	public Escala(String primeiraNota) {
		
		primeiraNota = primeiraNota.toUpperCase();
		
		if(verificarNota(primeiraNota) == false) {
			throw new EscalaException("Essa nota não existe.");
			
		}

		
		this.primeiraNota = primeiraNota;
		
		escala = new ArrayList<>();

		
		grau = verificarGrau(primeiraNota);
		
		
		
		while(escala.size() <= 6) {
			
			if(escala.size() == 0) {
				int primeiroParaSegundo = grau;
				escala.add(getNota(primeiroParaSegundo));
				grau += tom;
			}
				
			if(escala.size() == 1) {
				int segundoParaTerceiro = grau;
				
				if(segundoParaTerceiro <= 11) {
					escala.add(getNota(segundoParaTerceiro));
					grau += tom;
				} else {
					acabarEscala(grau);
				}
			}
			
			if(escala.size() == 2) {
				int terceiroParaQuarto = grau;
				
				if(terceiroParaQuarto <= 11) {
					escala.add(getNota(terceiroParaQuarto));
					grau += semiTom;
				}  else {
					acabarEscala(grau);
				}
			}
			
			if(escala.size() == 3) {
				
				int quartoParaQuinto = grau;
				
				if(quartoParaQuinto <= 11) {
					escala.add(getNota(quartoParaQuinto));
					grau += tom;
				} else {
					acabarEscala(grau);
				}
			}
			
			if(escala.size() == 4) {
				
				int quintoParaSexto = grau;
				
				if(quintoParaSexto <= 11) {
					escala.add(getNota(quintoParaSexto));
					grau += tom;
				}  else {
					acabarEscala(grau);
				}
			}
			
			if(escala.size() == 5) {
				
				int sextoParaSetimo = grau;
				
				if(sextoParaSetimo <= 11) {
					escala.add(getNota(sextoParaSetimo));
					grau += tom;
				}  else {
					acabarEscala(grau);
				}
			}
			
			if(escala.size() == 6) {
				
				int setimoParaOitava = grau;
				
				if(setimoParaOitava <= 11) {
					escala.add(getNota(setimoParaOitava));
					grau += semiTom;
				}  else {
					acabarEscala(grau);
				}
			}
		}
		
	}

	public String getPrimeiraNota() {
		return primeiraNota;
	}
	
	public ArrayList<String> verEscala() {
		
		int n = escala.size();
		
		for (int i = 0; i < n; i++) {
		      System.out.printf("%dº Intervalo: %s\n", (i + 1), escala.get(i));
		    }
		return escala;
	}
	
	public void verificarIntervalo() {
		
		if(escala.size() == 0 || escala.size() == 1 || escala.size() == 2 || escala.size() == 4 || escala.size() == 5) {
			this.grau += tom;
		}
		
		if(escala.size() == 3 || escala.size() == 6) {
			this.grau += semiTom;
		}
	}
	
	public void acabarEscala(int indexEscalaCromatica) {
		
		if(indexEscalaCromatica == 12) {
			this.grau = 0;
			escala.add(getNota(grau));
			
			verificarIntervalo();
			
		} else if(indexEscalaCromatica == 13) {
			this.grau = 1;
			escala.add(getNota(grau));
			
			verificarIntervalo();
		}
		
	}
	
	
	
	
	
	
	
	
	
}
