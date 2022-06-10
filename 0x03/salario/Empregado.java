public class Empregado {

	public double salarioFixo;

	public double getSalarioFixo() {
		return salarioFixo;
	}

	public void setSalarioFixo(double salarioFixo) {
		this.salarioFixo = salarioFixo;
	}

	public Empregado(double salarioFixo) {
		super();
		this.salarioFixo = salarioFixo;
	}

	public double calcularBonus(Departamento departamento) {
		if (departamento.alcancouMeta()) {
			return getSalarioFixo() * 0.1;
		}

		return 0;
	}
	
	public double calcularSalarioTotal(Departamento departamento) {
		return getSalarioFixo() + calcularBonus(departamento);
	}
}