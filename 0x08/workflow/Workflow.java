package workflow;
import java.util.List;

import atividades.Atividade;

public class Workflow {
	
	public void registrarAtividade(Atividade atividade) {
		atividade.executar();
	}

}