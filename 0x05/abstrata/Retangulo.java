
public class Retangulo extends FormaGeometrica{
	protected double largura;
	protected double altura;
	
	public double getLargura() {
		return largura;
	}
	public void setLargura(double largura) {
		this.largura = largura;
		if(largura <0) {
			throw new java.lang.IllegalArgumentException("Largura deve ser maior ou igual a 0");
		}else {
			this.largura = largura;
		}
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
		if(altura <0) {
			throw new java.lang.IllegalArgumentException("Altura deve ser maior ou igual a 0");
			}else {
				this.altura = altura;
			}
	}
	
	@Override
	public double area() {
		return largura * altura;
		
	}
	@Override
	public String toString() {
		return "[Retangulo] "+ String.format("%.2f", largura)  + " / " + String.format("%.2f", altura);
	}
	
	

}
