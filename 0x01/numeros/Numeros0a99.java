import java.util.ArrayList;
import java.util.List;

public class Numeros0a99 {
	public static void main(String[]args) {
		pilha();
		
	}
	public static void pilha() {
		for (int i = 0; i <= 99; i++) {
			if (i != 99) {
			System.out.print(i + ", ");
			} else {
				
				System.out.print(i + "\n");
			}
		}
		
	}
}
