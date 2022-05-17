public class Program {

	public static void main(String[] args) {
		 try {
		     int valor; 
		     valor = 1;
		     System.out.println(valor + " - " + isPrime(valor));

		 } catch (Exception e) {
		     System.out.println(e);
 }
		 try {
		     int valor1 = Integer.parseInt("43");
		     System.out.println(valor1 + " - " + isPrime(valor1));

		 } catch (Exception e) {
		     System.out.println(e);
		                    }
		 try {
	         Boolean valorBoolean = "-1".matches("[0-9]*");
	            if (valorBoolean == false) {
	                int valor1 = (Integer) null;

	            }
	        } catch (Exception e) {
	            System.out.println("Valor nao eh um valor inteiro positivo");
	        }
		 try {
		     int valor1 = Integer.parseInt("44");
		     System.out.println(valor1 + " - " + isPrime(valor1));

		 } catch (Exception e) {
		     System.out.println(e);
		                    }
		 try {
	         Boolean valorBoolean = "-1".matches("[0-9]*");
	            if (valorBoolean == false) {
	                int valor1 = (Integer) null;

	            }
	        } catch (Exception e) {
	            System.out.println("Valor nao eh um valor inteiro positivo");
	        }
		 
		 try {
		     int valor1 = Integer.parseInt("378");
		     System.out.println(valor1 + " - " + isPrime(valor1));

		 } catch (Exception e) {
		     System.out.println(e);
		                    }
		 try {
		     int valor1 = Integer.parseInt("379");
		     System.out.println(valor1 + " - " + isPrime(valor1));

		 } catch (Exception e) {
		     System.out.println(e);
		                    }
		 
		    }
	static boolean isPrime(int n)
    {
        // Corner case
        if (n <= 1)
            return false;

        // Check from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }
}
