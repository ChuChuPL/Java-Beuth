package pr1.a10;

import java.io.PrintWriter;

import java.util.ArrayList;

public class Personen {
	
	public static void printPersons(ArrayList<Person> persons, PrintWriter out) {
		for (Person p : persons){
			printPerson(p, out);
		}
		out.println();
	}
	
	public static void printPerson(Person p, PrintWriter out) { //Hilfsfunktion
		out.printf("%-10s", p.getVorname());
		out.printf("%-15s", p.getNachname());
		out.printf("%-4d", p.getGeburtsjahr());
		out.println();
	}
	
	
	public static ArrayList <Person> createTestPersonliste(){
		schimkat.berlin.lernhilfe2019ws.objectPlay.PersonList objectPlayPL = 
				schimkat.berlin.lernhilfe2019ws.objectPlay.Factory.createTestPersonliste();
		ArrayList<Person> a10PL = new ArrayList <Person>();
		
		for(schimkat.berlin.lernhilfe2019ws.objectPlay.Person p : objectPlayPL) {
			a10PL.add(new Person(p.getVorname(), p.getNachname(), p.getGeburtsjahr()));
//						a07PL.add(new Person(p));
//			p nur als Parameter ging nicht, weil es nicht auf Person in pr1.a07.Person zurückgegriffen hat, sondern auf p von Schimkat
		}
		return a10PL;
	}

}
