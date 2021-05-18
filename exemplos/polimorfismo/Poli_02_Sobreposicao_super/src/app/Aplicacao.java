package app;
public class Aplicacao {
	public static void main(String[] args) {
		try {
			
			
		EstendeMostra est = new EstendeMostra();
		SuperMostra sup = est;
		
		System.out.println("est.str = " + est.str);
		System.out.println("sup.str = " + sup.str);

		est.mostra();
		sup.mostra();
	
		System.out.println("\n-------------\n");
		System.out.println("sup.str = " + sup.str);
		System.out.println("sup.str = " + ((EstendeMostra) sup).str);
		
		
		sup = new SuperMostra();
		sup.mostra();
		
	
		System.out.println("\n-------------\n");

		if (sup instanceof EstendeMostra)
		      ((EstendeMostra) sup).mostra2();
		else if (sup instanceof SuperMostra) 
			System.out.println("Esta apontando pra SuperMostra");

		
		
		System.out.println("Objeto  super: " + sup);
		

//		 EstendeMostra est2;
//		 
//		 
//		 est2 = (EstendeMostra) est.clone();
//		 est2.str = "novaString";
//			
//		 System.out.println("est.str  = " + est.str);
//			
//			
//		
//		 est.mostra();
//		 System.out.println("est.str  = " + est.str);
//		
//		 sup.mostra();
//		 System.out.println("sup.str  = " + sup.str + "\n");
		
	
		
		} catch (Exception e) {
			System.out.println("Meu tratador!!!!!!!!!");
			System.out.println(e);
		}

	}
}

