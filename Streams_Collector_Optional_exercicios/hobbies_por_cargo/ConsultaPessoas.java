import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class ConsultaPessoas {

	public static TreeMap<String, TreeSet<Pessoa>> obterPessoasAgrupadasPorCargoEmOrdemReversa(
			List<Pessoa> listPessoas) {

		Supplier<TreeMap<String, TreeSet<Pessoa>>> novaLista = () -> new TreeMap<>(Comparator.reverseOrder());
		return listPessoas.stream()
				.collect(Collectors.groupingBy(Pessoa::getCargo, novaLista, Collectors.toCollection(TreeSet::new)));

	}

	public static Map<String, Long> obterContagemPessoasPorCargo(List<Pessoa> listPessoas) {

		return listPessoas.stream().collect(Collectors.groupingBy(Pessoa::getCargo, Collectors.counting()));
	}

	public static Map<String, Map<Integer, Long>> obterContagemPessoasPorCargoEIdade(List<Pessoa> listPessoas) {

		return listPessoas.stream().collect(Collectors.groupingBy(Pessoa::getCargo,
				Collectors.groupingBy(Pessoa::getIdade, Collectors.counting())));
	}

	public static Map<String, Double> obterMediaSalarioPorCargo(List<Pessoa> listPessoas) {
		return listPessoas.stream()
				.collect(Collectors.groupingBy(Pessoa::getCargo, Collectors.averagingDouble(Pessoa::getSalario)));
	}

	public static Map<String, TreeSet<String>> obterHobbiesPorCargo(List<Pessoa> listPessoas) {

		return listPessoas.stream().collect(Collectors.groupingBy(Pessoa::getCargo,
				Collectors.flatMapping(pessoa -> pessoa.getHobbies().stream(), Collectors.toCollection(TreeSet::new))));
	}

}
