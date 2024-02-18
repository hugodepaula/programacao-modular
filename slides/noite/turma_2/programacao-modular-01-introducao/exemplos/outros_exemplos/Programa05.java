
public class Programa05 {

	public static void main(String[] args) {
		String a = "0001234";
		
		while (a.charAt(0) == '0') {
			a = a.substring(1);
		}
		
		System.out.println(a);

	}

}
