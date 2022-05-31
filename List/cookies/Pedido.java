import java.util.ArrayList;

public class Pedido {

	private ArrayList<PedidoCookie> cookies;

	public Pedido() {
		super();
		this.cookies = new ArrayList<PedidoCookie>();
	}

	public void adicionarPedidoCookie(PedidoCookie cookie) {
		this.cookies.add(cookie);
	}

	public int obterTotalCaixas() {
		int sum = this.cookies.stream().filter(cookie -> cookie.getQuantidadeCaixas() > 0)
				.mapToInt(cookie -> cookie.getQuantidadeCaixas()).sum();

		return sum;
	}

	public int removerSabor(String sabor) {

		int total = 0;
		ArrayList<PedidoCookie> list = new ArrayList<PedidoCookie>();
		for (PedidoCookie cookie : this.cookies) {
			if (cookie.getSabor().equalsIgnoreCase(sabor)) {
				total += cookie.getQuantidadeCaixas();
			} else {
				list.add(cookie);
			}

		}

		this.cookies = list;

		return total;

	}

	public ArrayList<PedidoCookie> getCookies() {
		return cookies;
	}

	public void setCookies(ArrayList<PedidoCookie> cookies) {
		this.cookies = cookies;
	}

}
