import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Blog<V, K> {

	List<Post> listaPost = new ArrayList<>();
	Integer contagemDevops = 0; 
	Integer contagemDesenvolvimento = 0; 

	public void adicionarPostagem(Post post1) {
		listaPost.add(post1);
	}
	
	public Set<String> obterTodosAutores() {
		
		Set<String> autores = new HashSet<String>();
		
		for (Post post : listaPost) {
			autores.add(post.getAutor());
		}
		return autores;
		
	}
	
	public Map<String, Integer> obterContagemPorCategoria() {
		Map<String,Integer> contagem = new HashMap<String, Integer>();
		for (Post post : listaPost) {
			if (post.getCategoria().equals("Desenvolvimento")) {
				contagemDesenvolvimento = contagemDesenvolvimento + 1;
				contagem.put(post.getCategoria(), contagemDesenvolvimento);
			}else {
				contagemDevops =contagemDevops + 1;
				contagem.put(post.getCategoria(), contagemDevops);
			}				
		}
		
		 List<Entry<String, Integer>> list = new LinkedList<>(contagem.entrySet());
		    Collections.sort(list, new Comparator<Object>() {
		       @SuppressWarnings("unchecked")
			public int compare(Object o1, Object o2) {
		            return ((Comparable<Integer>) ((Map.Entry<Integer, Integer>) (o1)).getValue()).compareTo(((Map.Entry<Integer, Integer>) (o2)).getValue());
		        }
		    });
		    Map<String, Integer> result = new LinkedHashMap<>();
		    for (Iterator<Entry<String, Integer>> it = list.iterator(); it.hasNext();) {
		        Entry<String, Integer> entry = (Map.Entry<String, Integer>) it.next();
		        result.put(entry.getKey(), entry.getValue());
		    }
		
		return result;
	}
	
	
}
