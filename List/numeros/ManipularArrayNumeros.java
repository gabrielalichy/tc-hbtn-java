import java.util.List;
import java.util.ArrayList;

public class ManipularArrayNumeros {

	private static Integer buscarPosicaoNumero(List<Integer> inteiros, int buscaNumero) {

		for (int i = 0; i < inteiros.size(); i++) {

			if (inteiros.get(i) == buscaNumero) {
				return inteiros.get(i);
			}
		}
		return -1;

	}

	public static void adicionarNumero(List<Integer> inteiros, int addNumero) {

		Integer retorno = buscarPosicaoNumero(inteiros, addNumero);

		if (retorno > -1) {
			try {
				throw new Exception();
			} catch (Exception e) {
				System.out.println("Numero jah contido na lista");
			}
		} else {
			inteiros.add(addNumero);
		}

	}

	public static void removerNumero(List<Integer> inteiros, int removerNumero) {

		Integer remover = buscarPosicaoNumero(inteiros, removerNumero);

		
		for (int i = 0; i < inteiros.size(); i++) {
			if (inteiros.get(i) == remover) {
				inteiros.remove(i);
			}
		}
		 if(remover != removerNumero) {
			try {
				throw new Exception();
			} catch (Exception e) {
				System.out.println("Numero nao encontrado na lista");
			}
		}
	}

	public static void substituirNumero(List<Integer> inteiros, int numeroSubstituir, int numeroSubstituto) {
		Integer substitui = buscarPosicaoNumero(inteiros, numeroSubstituir);
			if(substitui == numeroSubstituir) {
				inteiros.set(2,numeroSubstituto);
				inteiros.remove(2);
		}
			inteiros.add(numeroSubstituto);
	}

}
	 
