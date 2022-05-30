import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ProcessadorVideo {
	
	List<CanalNotificacao> canais = new ArrayList<CanalNotificacao>();
	
	public void registrarCanal(CanalNotificacao canal) {
	canais.add(canal);
}
	public void processar(Video video) {
		for (int i = 0; i < canais.size(); i++) {
		System.out.println("[" + canais.get(i).getClass().getSimpleName().toUpperCase() + "] "+ "{" + TipoMensagem.LOG + "} - "  +  video.getArquivo() + " - " +video.getFormato());			
		}
	}


}

