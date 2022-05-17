public class InteiroPositivo {

    public InteiroPositivo(){

    }

    InteiroPositivo inteiroPositivo = new InteiroPositivo("1");

    private int valor;
    static boolean Positivo(String valor){
    Boolean valorBoolean = valor.matches("[0-9]*");
	            if (valorBoolean == false) {
	                valor = (Integer) null;

	            }
                return valorBoolean;
            }
            public int InteiroPositivo(String valor){
               this.valor = Interger.parsInt(valor);
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