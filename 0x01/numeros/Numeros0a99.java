import java.util.ArrayList;
import java.util.List;

public class Numeros0a99 {
	public static void main(String[]args) {
		pilha();
		
	}
	public static void pilha() {
		List <Integer> listaInteiro = new ArrayList<>();
		for (int i = 0; i <= 99; i++) {
			listaInteiro.add(i);
		}
		System.out.println(listaInteiro + "\n");
				
	}
}
