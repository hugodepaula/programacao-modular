/**
 * Este exemplo foi adaptado do Java Concurrency Tutorial, da Oracle
 * 
 * https://docs.oracle.com/javase/tutorial/essential/concurrency/syncrgb.html
 * A Synchronized Class Example
 * 
 * Note que, apesar de todos os m�todos da classes serem synchronized, os nomes
 * das cores n�o batem com os respectivos c�digos. Isto ocorre porque as m�ltiplas
 * threads podem alternar a execu��o durante a recupera��o do estado do objeto. 
 * 
 * @author Oracle
 * 
 */
public class SyncRGB {
	private int red;
	private int green;
	private int blue;
	
	private String name;

	public static SyncRGB color;

	private void check(int red, int green, int blue) {
		if (red < 0 || red > 255 || green < 0 || green > 255 || blue < 0 || blue > 255) {
			throw new IllegalArgumentException();
		}
	}

	public SyncRGB(int red, int green, int blue, String name) {
		check(red, green, blue);
		this.red = red;
		this.green = green;
		this.blue = blue;
		this.name = name;
	}

	public void set(int red, int green, int blue, String name) {
		check(red, green, blue);
		
		synchronized (this) {
			this.red = red;
			this.green = green;
			this.blue = blue;
			this.name = name;
		}
	}

	public synchronized int getRGB() {
		return ((red << 16) | (green << 8) | blue);
	}

	public synchronized String getName() {
		return name;
	}

	public synchronized void invert() {
		red = 255 - red;
		green = 255 - green;
		blue = 255 - blue;
		name = "Inverse of " + name;
	}

	public static void execute() {
		try {
			int myColorInt = color.getRGB();
			Thread.sleep(1);
			String myColorName = color.getName();
			synchronized (myColorName) {
				System.out.println("Color int: " + myColorInt);
				System.out.println("Color name: " + myColorName);
			}
		} catch (InterruptedException e) {

		}
	}

	public static void main(String[] args) {
		color = new SyncRGB(0, 0, 0, "PRETO");

		new Thread(() -> execute()).start();
		new Thread(() -> color.set(255, 0, 0, "VERMELHO")).start();

		new Thread(() -> execute()).start();
		new Thread(() -> color.set(0, 255, 0, "VERDE")).start();

		new Thread(() -> execute()).start();

		new Thread(() -> color.set(0, 0, 255, "AZUL")).start();
		new Thread(() -> execute()).start();

	}
}
