package app;

// O comando import serve para referenciar um pacote ou uma classe, semelhante ao #INCLUDE
import java.lang.Math;

/**
 * <p>
<<<<<<< HEAD:exemplos/intro/Intro_01_RevisaoAED/src/app/RevisaoAED.java
 * Ilusta o conceito de semântica de referência com o uso de uma classe
=======
 * Ilustra o conceito de semântica de referência com o uso de uma classe
>>>>>>> ad5ca93c5a20d22dff5b738bdb3a85a84bb90ee6:codes/java/intro/Intro_01_RevisaoAED/src/app/RevisaoAED.java
 * (semelhante à <code>struct</code>) e de um vetor.
 * </p>
 *
 * @author Hugo de Paula
 * 
 */
public class RevisaoAED {

	/**
	 *
	 * O programa espera receber um argumento da linha de comando que corresponde ao
	 * número de elementos que se deseja criar (o tamanho do vetor).
	 * <p>
	 * O programa irá criar um vetor de raios de circunferências e irá calcular as
	 * áreas dessas respectivas circunferências. Finalmente o programa irá exibir na
	 * tela o raio de uma circunferência com suas respectivas áreas.
	 * 
	 * @param args número inteiro positivo que representa a quantidade de raios que
	 *             se deseja calcular
	 *
	 */
	public static void main(String args[]) {

		// Lê o argumento da linha de comando na forma de uma string e converte para
		// inteiro usando a classe utilitária Integer.
		int numCirc = Integer.parseInt(args[0]);

		// declara as variáveis raios e areas, que são referências (ponteiros)
		// para vetores de números reais
		double[] raios = new double[numCirc];
		double[] areas = new double[numCirc];

		Constante pi = new Constante();
		pi.nome = "pi";
		pi.valor = 3.1415926;

		for (int i = 0; i < numCirc; i++) {
			raios[i] = Math.random();
			areas[i] = pi.valor * raios[i] * raios[i];
			System.out.println("Area de circ com raio " + raios[i] + " é igual a " + areas[i] + ".");
		}
	}
}

/**
 *
 * Semelhante à uma struct na linguagem C, em que se declara uma estrutura com
 * campos.
 *
 */
class Constante {
	String nome;
	double valor;
}
