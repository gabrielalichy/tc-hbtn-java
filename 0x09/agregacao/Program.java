public class Program {
	public static void main(String[] args) {
		Endereco endereco = new Endereco("Rua Marechal Deodoro",
	                    "135",
	                    "".trim(),
	                    "Santo Amaro",
	                    "Sao Paulo",
	                    "SP",
	                    "Brasil");

	            Empregado empregado = new Empregado("Jane Doe", 1, endereco);

	            empregado.apresentar(empregado.codigo,empregado.nome,endereco);
	            System.out.println();
	        }
	    }


