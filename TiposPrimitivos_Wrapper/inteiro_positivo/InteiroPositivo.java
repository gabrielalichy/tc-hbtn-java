public class InteiroPositivo {
    private int valor;
    static boolean inteiroPositivo(String valor){
    Boolean valorBoolean = valor.matches("[0-9]*");
	            if (valorBoolean == false) {
	                valor = (Integer) null;

	            }
            }

    static boolean ehPrimo(int valor){
        // Corner case
        if (valor <= 1)
            return false;

        // Check from 2 to n-1
        for (int i = 2; i < valor; i++)
            if (valor % i == 0)
                return false;

        return true;
    }
}