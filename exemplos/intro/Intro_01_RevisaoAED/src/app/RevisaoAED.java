package app;

// O comando import serve para referenciar um pacote ou uma classe, semelhante ao #INCLUDE
import java.lang.Math;

/**
 * <p>
<<<<<<< HEAD:exemplos/intro/Intro_01_RevisaoAED/src/app/RevisaoAED.java
 * Ilusta o conceito de sem�ntica de refer�ncia com o uso de uma classe
=======
 * Ilustra o conceito de sem�ntica de refer�ncia com o uso de uma classe
>>>>>>> ad5ca93c5a20d22dff5b738bdb3a85a84bb90ee6:codes/java/intro/Intro_01_RevisaoAED/src/app/RevisaoAED.java
 * (semelhante � <code>struct</code>) e de um vetor.
 * </p>
 *
 * @author Hugo de Paula
 * 
 */
public class RevisaoAED {

	/**
	 *
	 * O programa espera receber um argumento da linha de comando que corresponde ao
	 * n�mero de elementos que se deseja criar (o tamanho do vetor).
	 * <p>
	 * O programa ir� criar um vetor de raios de circunfer�ncias e ir� calcular as
	 * �reas dessas respectivas circunfer�ncias. Finalmente o programa ir� exibir na
	 * tela o raio de uma circunfer�ncia com suas respectivas �reas.
	 * 
	 * @param args n�mero inteiro positivo que representa a quantidade de raios que
	 *             se deseja calcular
	 *
	 */
	public static void main(String args[]) {

		// L� o argumento da linha de comando na forma de uma string e converte para
		// inteiro usando a classe utilit�ria Integer.
		int numCirc = Integer.parseInt(args[0]);

		// declara as vari�veis raios e areas, que s�o refer�ncias (ponteiros)
		// para vetores de n�meros reais
		double[] raios = new double[numCirc];
		double[] areas = new double[numCirc];

		Constante pi = new Constante();
		pi.nome = "pi";
		pi.valor = 3.1415926;

		for (int i = 0; i < numCirc; i++) {
			raios[i] = Math.random();
			areas[i] = pi.valor * raios[i] * raios[i];
			System.out.println("Area de circ com raio " + raios[i] + " � igual a " + areas[i] + ".");
		}
	}
}

/**
 *
 * Semelhante � uma struct na linguagem C, em que se declara uma estrutura com
 * campos.
 *
 */
class Constante {
	String nome;
	double valor;
}
