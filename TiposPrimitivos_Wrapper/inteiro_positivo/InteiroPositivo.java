public class InteiroPositivo {
	int valor;
	  public InteiroPositivo(){
	    	
	    }
	    public InteiroPositivo(int valor){
	    	this.valor = valor;
	    }
	    public InteiroPositivo(String valor){
	    	try {
	    		this.valor= Integer.parseInt(valor);
	    		
	    			if (!(this.valor > 0))	{
	    				throw new Exception();
	    			}
	    		}catch(Exception e) {throw new IllegalArgumentException("Valor nao eh um valor inteiro positivo");
	    		
	    		}
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