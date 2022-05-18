public class Program { 
 
	public static void main(String[] args) {
		 try {
			InteiroPositivo inteiroPositivo = new InteiroPositivo("1");
			   int valor1 = Integer.parseInt("1");
			System.out.println(inteiroPositivo.getValor() + " - " + inteiroPositivo.ehPrimo(valor1));

		 } catch (Exception e) {
			System.out.println(e.getMessage());
		 }
		 try {
			InteiroPositivo inteiroPositivo = new InteiroPositivo();
		     int valor1 = Integer.parseInt("43");
		     System.out.println(valor1 + " - " + inteiroPositivo.ehPrimo(valor1));

		 } catch (Exception e) {
			System.out.println(e.getMessage());
				                    }
		 try {
			InteiroPositivo inteiroPositivo = new InteiroPositivo("-1");
	        } catch (Exception e) {
				System.out.println(e.getMessage());
				        }
		 try {
			 InteiroPositivo inteiroPositivo = new InteiroPositivo("44");
		     int valor1 = Integer.parseInt("44");
		     System.out.println(valor1 + " - " + inteiroPositivo.ehPrimo(valor1));

		 } catch (Exception e) {
			System.out.println(e.getMessage());
				                    }
		 try {
			InteiroPositivo inteiroPositivo = new InteiroPositivo("-1");
	        } catch (Exception e) {
				System.out.println(e.getMessage());	        }
		 
		 try {
			InteiroPositivo inteiroPositivo = new InteiroPositivo("379");
		     int valor1 = Integer.parseInt("379");
		     System.out.println(valor1 + " - " + inteiroPositivo.ehPrimo(valor1));

		 } catch (Exception e) {
			System.out.println(e.getMessage());		                    }
		 try {
			InteiroPositivo inteiroPositivo = new InteiroPositivo("378");
		      int valor1 = Integer.parseInt("378");
		     System.out.println(valor1 + " - " + inteiroPositivo.ehPrimo(valor1));

		 } catch (Exception e) {
			 System.out.println(e.getMessage());		                    }
		 
		    
}
}