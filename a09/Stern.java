package pr1.a09;

import java.awt.Color;

public class Stern extends Himmelskörper{

	public Stern(Point p, int radius) { // vollst Konstruktor
		super(p, radius, Color.YELLOW);
	}
	
	public Stern(Point p) { //hilfskonstruktor
		this(p, 2);
	}
	
	public Stern(Stern other) {
		this(other.position, other.radius);//sollte immer auf den vollst K zurückgreifen
//		this(other.position); //ruft eigenen K auf gefährlich, weil dann Sonne nicht kopiert werden kann ohne ihren Radius
	}
}
