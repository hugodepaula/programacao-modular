
public class Programa04 {

	public static void main(String[] args) {
		int temperatura = 30;
    Programa04 p = new Programa04();
		System.out.println(temperatura);
		System.out.println("Temperatura em celsius: " + temperatura);
		System.out.println("Temperatura em fahrenheit: " + Programa04.celsiusParaFahrenheit2(temperatura));
	}
	
	public static double celsiusParaFahrenheit2(double f) {
		return 1;
	}
	public double celsiusParaFahrenheit(int f) {
		return (f * 9d/5) + 32;
	}

}
