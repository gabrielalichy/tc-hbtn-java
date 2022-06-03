import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.TreeSet;

public class NumerosDuplicados {

	public static void contagemPalvras(){
		
		TreeMap<String, Integer> map = new TreeMap<String, Integer>();
	}

	public static TreeSet<Integer> buscar(int[] is) {
		
		TreeSet<Integer> mapeamento = new TreeSet<Integer>();
		int[] numeros = new int[is.length];
		for (int i = 0; i < numeros.length; i++) {
		    numeros[i] = numeros[i];
		}
		
		Map<Integer, List<Integer>> cont = new LinkedHashMap<>();
		for (int i = 0; i < is.length; i++) {
		    int n = is[i];
		    if (!cont.containsKey(n)) {
		        cont.put(n, new ArrayList<>());
		    }
		    cont.get(n).add(i);
		    numeros[i] = n;
		}
		for (Entry<Integer, List<Integer>> entry : cont.entrySet()) {
		    List<Integer> posicoes = entry.getValue();
		    if (posicoes.size() > 1) {
		    	mapeamento.add(entry.getKey());
		    }
		}
	 
		return mapeamento;
	}
}