package app;

/**
 * Código inspirado em Beginning Java Programming (2015) - Bart Baesens and
 * Aimée Backiel Capítulo 1
 * 
 * @author Bart Baesens and Aimée Backiel
 * 
 **/
public class CalculadoraIMC {
	private double peso, altura, imc;

	/**
	 * Método responsável por construir e inicializar um objeto da classe
	 * <code>CalculadoraIMC</code>.
	 * 
	 * @param peso   recebe o valor inicial do peso.
	 * @param altura recebe o valor inicial da altura.
	 */
	public CalculadoraIMC(double peso, double altura) {
		this.peso = peso;
		this.altura = altura;
	}

	/**
	 * Calcula o Índice de Massa Corporal (IMC).
	 */
	public void calcular() {
		imc = peso / (altura * altura);
	}

	/**
	 * Verifica se as condições de peso e altura cadastradas configuram situação de
	 * sobrepeso.
	 * 
	 * @return verdadeiro se as situações de peso e altura configuram sobrepeso.
	 */
	public boolean temSobrepeso() {
		return (imc > 25);
	}

	/**
	 * Método de acesso ao atributo IMC.
	 * 
	 * @return valor do IMC.
	 */
	public double getImc() {
		return imc;
	}
}
