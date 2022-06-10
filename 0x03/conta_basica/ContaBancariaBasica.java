import exceptions.OperacaoInvalidaException;

public class ContaBancariaBasica {

	
	//unica que identifica a conta;
	public String numeracao;
	//saldo atual da conta;
	public double saldo;
	//percentual de juros anual;
	public double taxaJurosAnual;
	
	
	public ContaBancariaBasica(String numeracao, double taxaJurosAnual) {
		this.saldo = 0;
		this.numeracao = numeracao;
		this.taxaJurosAnual = taxaJurosAnual;
	}
	
	public void depositar(double valor) throws OperacaoInvalidaException {
        if (valor <= 0){
            throw new OperacaoInvalidaException("Valor para deposito deve ser maior que 0");
        }
        this.saldo +=valor;

    }

    public void sacar(double valor) throws OperacaoInvalidaException {
        if (valor <= 0){

            throw new OperacaoInvalidaException("Valor de saque deve ser menor que 0");
        } else if (valor > this.saldo) {

            throw new OperacaoInvalidaException("Valor de saque deve ser menor que o saldo atual");
        }
        this.saldo -=valor;
    }

    public double calcularTarifaMensal(){
        return Math.min(this.saldo * 0.10, 10.0);
    }


    public double calcularJurosMensal(){
        if (this.saldo < 0){
            return 0;
        }
        return this.saldo * (this.taxaJurosAnual / 100.0) / 12.0;
    }


    public void aplicarAtualizacaoMensal(){
        this.saldo = this.getSaldo() - calcularTarifaMensal() + calcularJurosMensal();
    }



	
	
	public String getNumeracao() {
		return numeracao;
	}
	public void setNumeracao(String numeracao) {
		this.numeracao = numeracao;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getTaxaJurosAnual() {
		return taxaJurosAnual;
	}
	public void setTaxaJurosAnual(double taxaJurosAnual) {
		this.taxaJurosAnual = taxaJurosAnual;
	}
	
	
	
}
