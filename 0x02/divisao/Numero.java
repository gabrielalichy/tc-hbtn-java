public class Numero {

	public static void dividir(int a, int b) {
		int resultadoDivisao = 0;
		try {
			resultadoDivisao = (a/b);
		}catch (Exception ex) {
			System.out.println("Nao eh possivel dividir por zero");
			resultadoDivisao = 0;
		}finally {
			System.out.println(a+" / "+b + " = "+resultadoDivisao);
		}
	}
	
}
