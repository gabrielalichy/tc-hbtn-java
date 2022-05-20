import java.sql.Array;
import comida.Comida;
import humor.Humor;

public class Personagem {
	int pontosDeFelicidade;

	public Humor obterHumorAtual(){
		Humor humor = new Humor() {
		};
		return humor;		
	}
	
	public Comida[] comer(Comida[] comidas) {
	
		return comidas;
	
	}

	@Override
	public String toString() {
		return pontosDeFelicidade + " - " + obterHumorAtual().getClass().getName();
	}

}	
