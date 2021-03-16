package pr1.a09;

import java.awt.Color;
import java.awt.Graphics;

import schimkat.berlin.lernhilfe2019ws.graphics.Drawable;

public class Himmel implements Drawable{

	protected Color color;
	
	public Himmel(Color color) {
		this.color = color;	
	}
	
	@Override
	public void draw(Graphics g) {
		g.setColor(color);
		g.fillRect(0,  0,  1000, 1000);
	}
}
