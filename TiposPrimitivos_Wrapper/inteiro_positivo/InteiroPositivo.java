public class InteiroPositivo {
	int valor;
	  public InteiroPositivo(){
          	    	
	    }
	    public InteiroPositivo(int valor){
	    	this.valor = valor;
	    }

        public InteiroPositivo(String valor){
            this.valor= Integer.parseInt(valor);
            
        }

	    public InteiroPositivo(long pilha){
	    	try {
                String valor = "1";
	    		this.valor= Integer.parseInt(valor);
	    		
	    			if (!(this.valor > 0))	{
	    				throw new Exception();
	    			}
	    		}catch(Exception e) {throw new IllegalArgumentException("Valor nao eh um valor inteiro positivo");
	    		
	    		}
	    		}
	    	
	        boolean ehPrimo(){
            if (this.valor <= 1)
            return false;

            for (int i = 2; i < this.valor; i++)
            if (this.valor % i == 0)
            return false;

        return true;
	    	
	    }
	    
        public int getValor() {
			return valor;
		}
		public void setValor(int valor) {
			this.valor = valor;
		}
	
			
		}