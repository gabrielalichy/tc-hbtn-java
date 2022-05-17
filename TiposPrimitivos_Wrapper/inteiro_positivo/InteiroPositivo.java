public class InteiroPositivo {
    private int valor;
    static boolean inteiroPositivo(String valor){
    Boolean valorBoolean = valor.matches("[0-9]*");
	            if (valorBoolean == false) {
	                valor = (Integer) null;

	            }
                return valorBoolean;
            }

    static boolean ehPrimo(int valor){
            if (valor <= 1)
            return false;

            for (int i = 2; i < valor; i++)
            if (valor % i == 0)
            return false;

        return true;
    }
}