package pr1.a09;

import java.awt.Color;
import java.awt.Graphics;

import schimkat.berlin.lernhilfe2019ws.graphics.Drawable;
//import schimkat.berlin.lernhilfe2019ws.graphics.Point;

public class Himmelskörper implements Drawable {
	
	protected Point position; // statt x y point Objekt
	protected int radius;
	protected Color color;
	
	public Himmelskörper(Point p, int radius, Color color) {
		// TODO Auto-generated constructor stub
		this.color = color;
		this.position = p;
		this.radius = radius;
	}
	
	public Himmelskörper(Himmelskörper other) {
		this(other.position, other.radius, other.color);
	}

	public void draw (Graphics g) {
		g.setColor(color);
		//g.setColor(Color.gray);
		g.fillOval(position.getX(), position.getY(), radius*2, radius*2);
	}

}
