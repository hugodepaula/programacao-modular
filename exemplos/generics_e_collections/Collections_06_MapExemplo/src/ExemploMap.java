import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ExemploMap {
	public static void main(String[] args) {

		boolean ignoreCase = true;
		Integer UM = Integer.valueOf(1);
		String palavra;
		
		Map<String, Integer> mapeamento = new HashMap<String, Integer>();
		
		for (String s: args)
			System.out.print(s + " ");
		System.out.println("\n\n");
		
		
		for (int i = 0; i < args.length; i++) {
			
			if (ignoreCase)
				palavra = args[i].replaceAll("[^a-zA-Z áéíóúàâêãõçü]", "").toLowerCase();
			else
				palavra = args[i].replaceAll("[^a-zA-Z áéíóúàâêãõçü]", "");
			
			Integer frequencia = mapeamento.get(palavra);
			if (frequencia == null) {
				frequencia = UM;
			} else {
				frequencia = Integer.valueOf(frequencia.intValue() + 1);
			}
			
			mapeamento.put(palavra, frequencia);
		}
		
		System.out.println(mapeamento);
		
		Map<String, Integer> mapeamentoOrdenado = new TreeMap<String, Integer>(mapeamento);
		
		System.out.println(mapeamentoOrdenado);
	}
}
