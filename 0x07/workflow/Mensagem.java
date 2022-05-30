
public class Mensagem {
	private static String texto;
	private static TipoMensagem tipoMensagem;


	public static String getTexto() {
		return texto;
	}

	public static void setTexto(String texto) {
		Mensagem.texto = texto;
	}

	public static TipoMensagem getTipoMensagem() {
		return tipoMensagem;
	}

	public static void setTipoMensagem(TipoMensagem tipoMensagem) {
		Mensagem.tipoMensagem = tipoMensagem;
	}
}