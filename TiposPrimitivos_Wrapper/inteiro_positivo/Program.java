public class Program { 
 
	public static void main(String[] args) {
		 try {
			InteiroPositivo inteiroPositivo = new InteiroPositivo("1");
			   int valor1 = Integer.parseInt("1");
			System.out.println(inteiroPositivo.getValor() + " - " + inteiroPositivo.ehPrimo());

		 } catch (Exception e) {
			System.out.println(e.getMessage());

		 }

		 InteiroPositivo inteiroPositivo1 = null;

		 try {
			 inteiroPositivo1 = new InteiroPositivo("43");
		     System.out.println(inteiroPositivo1.getValor() + " - " + inteiroPositivo1.ehPrimo());

		 } catch (Exception e) {
			System.out.println(e.getMessage());
				                    }
		 try {

			inteiroPositivo1.setValor(-1);
			System.out.println(inteiroPositivo1.getValor() + " - " + inteiroPositivo1.ehPrimo());
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
		        }
		 try {
			 inteiroPositivo1.setValor(inteiroPositivo1.getValor() + 1);
		     System.out.println(inteiroPositivo1.getValor() + " - " + inteiroPositivo1.ehPrimo());

		 } catch (Exception e) {
			System.out.println(e.getMessage());
				                    }
		 try {
			InteiroPositivo inteiroPositivo = new InteiroPositivo(-1L);
	        } catch (Exception e) {
				System.out.println(e.getMessage());	        }
		 
		 try {
			InteiroPositivo inteiroPositivo = new InteiroPositivo("379");
		     int valor1 = Integer.parseInt("379");
		     System.out.println(valor1 + " - " + inteiroPositivo.ehPrimo());

		 } catch (Exception e) {
			System.out.println(e.getMessage());		                    }
		 try {
			InteiroPositivo inteiroPositivo = new InteiroPositivo("378");
		      int valor1 = Integer.parseInt("378");
		     System.out.println(valor1 + " - " + inteiroPositivo.ehPrimo());

		 } catch (Exception e) {
			 System.out.println(e.getMessage());		                    }
		 
		    
}
}