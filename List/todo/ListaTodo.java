import java.util.ArrayList;
import java.util.List;

public class ListaTodo {

	private ArrayList<Tarefa> tarefas;
	boolean jaExiste = false;
	public ListaTodo() {
		super();
		this.tarefas = new ArrayList<Tarefa>();
	}

	public void adicionarTarefa(Tarefa addtarefa) {
		
		for (Tarefa tarefa : tarefas) {
			if (tarefa.getIdentificador() == addtarefa.getIdentificador()) {
				jaExiste = true;
				try {
					throw new Exception();
				} catch (Exception e) {
					System.out.println("Tarefa com identificador " + tarefa.getIdentificador() + " ja existente na lista");
				}
				
			}
			
		}
		if (jaExiste == false) {
			tarefas.add(addtarefa);
		}
	}

	public boolean marcarTarefaFeita(int identificador) {
		for (Tarefa tarefa : tarefas) {
			if (tarefa.getIdentificador() == identificador) {
				tarefa.setEstahFeita(true);
			}
		}
		return false;

	}

	public boolean desfazerTarefa(int identificador) {
		for (Tarefa tarefa : tarefas) {
			if (tarefa.getIdentificador() == identificador) {
				tarefa.setEstahFeita(true);
			}
		}
		return false;
	}

	public void desfazerTodas() {
		for (Tarefa tarefa : tarefas) {
			tarefa.setEstahFeita(false);
		}

	}

	public void fazerTodas() {
		for (Tarefa tarefa : tarefas) {
			tarefa.setEstahFeita(true);
		}

	}

	public void listarTarefas() {
		for (Tarefa tarefa : tarefas) {
			if (!jaExiste) {
				
			if (tarefa.estahFeita == true) {
				System.out.println("[X]" + " Id: " + tarefa.getIdentificador() + " - Descricao: " + tarefa.getDescricao());
			} 
			else {
				System.out.println("[ ]" + " Id: " + tarefa.getIdentificador() + " - Descricao: " + tarefa.getDescricao());
			}
			}
		}	
	}

}