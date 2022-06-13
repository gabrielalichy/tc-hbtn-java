import java.util.List;
import java.util.stream.Collectors;

public class Consulta {

	public static List<Produto> obterLivrosDoPedido(Pedido pedido) {

		List<Produto> produtoPedido = pedido.getProdutos();

		return produtoPedido.stream().filter(p -> p.getCategoria().equals(CategoriaProduto.LIVRO))
				.collect(Collectors.toList());

	}

}
