import java.util.Scanner;

public class Programa01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nome = sc.nextLine();
		
		System.out.println("Seu nome é " + nome);
		
		sc.close();
	}

}
