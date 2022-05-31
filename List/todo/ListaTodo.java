import java.util.ArrayList;
import java.util.List;

public class ListaTodo {

	private ArrayList<Tarefa> tarefas;
	
	public ListaTodo() {
		super();
		this.tarefas = new ArrayList<Tarefa>();
	}
	
	public void adicionarTarefa(Tarefa addtarefa) {
		for (Tarefa tarefa : tarefas) {
			if(tarefa.getIdentificador() == addtarefa.getIdentificador()) {
				try {
					throw new Exception();
				} catch (Exception e) {
					System.out.println("Tarefa com identificador " + tarefa.getIdentificador() + " ja existente na lista");
				}
			}
		}
		
		tarefas.add(addtarefa);
	}
	
	public boolean marcarTarefaFeita(int identificador) {
		boolean encontrada = false;
		for (Tarefa tarefa : tarefas) {
			if(tarefa.getIdentificador() == tarefa.identificador) {
				encontrada = true;
			}
		}
		return false;
		
	}
	
	public boolean desfazerTarefa(int identificador) {
		boolean encontrada = false;
		for (Tarefa tarefa : tarefas) {
			if(tarefa.getIdentificador() == tarefa.identificador) {
				encontrada = true;
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
			if(tarefa.estahFeita == true) {
				System.out.println("[X]" + " Id: " + tarefa.getIdentificador() + " - Descricao: " + tarefa.getDescricao());
				
				
			}else
			System.out.println("[ ]" + " Id: " + tarefa.getIdentificador() + " - Descricao: " + tarefa.getDescricao());
		}
	}
	
}
