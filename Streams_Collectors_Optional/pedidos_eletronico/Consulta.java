import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Consulta {

	public static List<Produto> obterLivrosDoPedido(Pedido pedido) {

		List<Produto> produtoPedido = pedido.getProdutos();

		return produtoPedido.stream().filter(p -> p.getCategoria().equals(CategoriaProduto.LIVRO))
				.collect(Collectors.toList());
	}

	public static Produto obterProdutoMaiorPreco(List<Produto> produtos) {

		Optional<Produto> maiorPreco = produtos.stream().max(Comparator.comparingDouble(Produto::getPreco));

		return maiorPreco.orElse(null);
	}

	public static List<Produto> obterProdutosPorPrecoMinimo(List<Produto> produtos, double precoMinimo) {

		return produtos = produtos.stream().filter(p -> p.getPreco() >= precoMinimo).collect(Collectors.toList());

	}

	public static List<Pedido> obterPedidosComEletronicos(List<Pedido> pedidos) {
		return pedidos.stream().filter(
				p -> p.getProdutos().stream().anyMatch(pr -> pr.getCategoria().equals(CategoriaProduto.ELETRONICO)))
				.collect(Collectors.toList());
	}
}