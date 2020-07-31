package main;

import observer.BinaryObserver;
import observer.HexaObserver;
import observer.OctalObserver;
import observer.Subject;

public class Aplicacao {

	public static void main(String[] args) {
		Subject subject = new Subject();
		new HexaObserver(subject);
		new OctalObserver(subject);
		new BinaryObserver(subject);

		System.out.println("\nPrimeira mudança de estado: 15");
		subject.setState(15);
		
		System.out.println("\nSegunda mudança de estado: 10");
		subject.setState(10);
	}

}
