import java.util.Map;
import java.util.TreeMap;


public class ExcecaoGeral extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private CodigoErro codigoErro;
	
	private Map<String, Object> propriedades = new TreeMap<String, Object>();
	
	public CodigoErro getCodigoErro() {
		return codigoErro;
	}

	public ExcecaoGeral setCodigoErro(CodigoErro erro) {
		codigoErro = erro;
		return this; 
	}
	
	public Map<String, Object> getPropriedades() {
		return propriedades;
	}
	
	@SuppressWarnings("unchecked")
	public <T> T get(String key) {
		return (T) propriedades.get(key);
	}
	
	public ExcecaoGeral set(String key, Object value) {
		propriedades.put(key, value);
		return this;
	}

	@Override
	public String getMessage() {
		
		return "Exceção Geral de código: " + codigoErro;
	}
	
	
}
