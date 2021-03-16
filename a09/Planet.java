package pr1.a09;

import java.awt.Color;

public class Planet extends Himmelskörper{

	protected Stern stern;
	protected double yearInDays;
	protected double bahnradius;
	
	public Planet(Point p, int radius, Color color, Stern stern, double yearInDays, double bahnradius) {//vollst Konstruktor
		super(p, radius, color);
		this.stern = stern;
		this.yearInDays = yearInDays;
		this.bahnradius = bahnradius;
	}
	
	public Planet(Point p, int radius, Stern stern, double yearInDays, double bahnradius) { //brauchen eigentlich nicht
		this(p, radius, new Color(0,50,255), stern, yearInDays, bahnradius);
	}
	
	public Planet(Planet other) {
		this(other.position, other.radius, other.color, other.stern, other.yearInDays, other.bahnradius); //Kopierkonstr //this gibt an vollst k werte
	}
	
	public void moveToPositionAtTime(double timeInDays) {
		double bogenmass = 2*Math.PI*timeInDays/yearInDays;
		double x = stern.position.getX() + bahnradius * Math.cos(bogenmass);
//		oder stern.q.x + (stern.radius
		double y = stern.position.getY() + bahnradius * Math.sin(bogenmass);
		position.moveAbs((int) x, (int) y); //aus point funktion
	}
}
