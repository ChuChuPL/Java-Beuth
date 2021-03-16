package pr1.a09;

import java.awt.Color;
//import schimkat.berlin.lernhilfe2019ws.graphics.Point;
import schimkat.berlin.lernhilfe2019ws.graphics.DirtyPainter;

public class Planetarium {
	public static void main(String[] args) {
		DirtyPainter painter = new DirtyPainter();
		double timeInDays = 0;
		
		painter.add(new Himmel(new Color(0, 0, 30)));
		
		for(int i=1; i<=200; i++) {
			painter.add(new Stern(new Point((int)(Math.random()*1000), (int)(Math.random()*1000))));
		}
		
//		painter.add(new Himmelskörper(new Point(200,200), 20, Color.GRAY));
		painter.add(new Himmelskörper(new Point(150,200), 20, Color.GRAY));
		painter.add(new Himmelskörper(new Point(400,100), 10, Color.GRAY));
		painter.add(new Himmelskörper(new Point(50,650), 30, Color.GRAY));
		
		Stern sonne = new Stern(new Point(500, 500), 20);
		Planet erde = new Planet(new Point(250, 250), 50, sonne, 365, 149.6*1.5);
		Planet mars = new Planet(new Point(750, 750), 50, new Color(150, 30, 0), sonne, 687, 266.2*1.5);
		painter.add(sonne);
		painter.add(erde);
		painter.add(mars);
		
		while(true) {
			timeInDays+=7;
//			timeInDays++;
			erde.moveToPositionAtTime(timeInDays);
			mars.moveToPositionAtTime(timeInDays);
			painter.showDrawingAfterWaiting(100);
		}
		
		
//		Himmelskörper hk = new Himmelskörper(new Point(200,200), 50, Color.GRAY);
//				
//		
//		painter.showDrawing();
	}

}