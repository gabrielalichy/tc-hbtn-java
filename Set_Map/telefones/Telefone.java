
public class Telefone {

	public String codigoArea;
	public String numero;

	
	public Telefone(String codigoArea, String numero) {
		this.codigoArea = codigoArea;
		this.numero = numero;
	}
	
	
	@Override
	public String toString() {
		return "(" + getCodigoArea() + ") " + getNumero();
	}


	public String getCodigoArea() {
		return codigoArea;
	}

	public void setCodigoArea(String codigoArea) {
		this.codigoArea = codigoArea;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

}