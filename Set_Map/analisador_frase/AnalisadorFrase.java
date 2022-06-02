import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AnalisadorFrase {

	public static void contagemPalvras(){
		
		TreeMap<String, Integer> map = new TreeMap<String, Integer>();
	}

	public static TreeMap<String, Integer> contagemPalavras(String string) {
		 String[] words = string.split("[ \n\t\r.;:!?(){}}]");
		 TreeMap<String, Integer> mapeamento = new TreeMap<String, Integer>();
		 for (int i = 0; i < words.length; i++) {
			String key  = words[i].toLowerCase();
			
			if(words[i].length() >= 1) {
				if(mapeamento.get(key) == null) {
					mapeamento.put(key,1);
				}
				else {
					int valor = mapeamento.get(key).intValue();
					valor++; 
					mapeamento.put(key, valor);
				}
			}
		}
		 
		return mapeamento;
	}
	
}