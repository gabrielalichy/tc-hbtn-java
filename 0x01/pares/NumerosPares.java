
public class NumerosPares {

	public static void main(String[] args) {
		pares();
	}
	
	public static void pares() {
		for (int i = 0; i <= 98; i++) {
			if (i % 2 == 0 && i != 98){
				
				System.out.print(i + ", ");
			} else if(i == 98) {
				System.out.print(i + "\n");
			}
			
		}
	}

}