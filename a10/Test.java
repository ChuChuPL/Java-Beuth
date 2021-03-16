package pr1.a10;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
public class Test {
	
	public static void main (String[] args) {
		PrintWriter out = new PrintWriter(System.out, true);
//		Scanner in = new Scanner(new DirtyFileReader(FactoryPersonliste));
		testA1(out);
		out.println();
		testA2(out);
		out.println();
		testA3(out);
		out.println();
		testA4(out);
		out.flush();
	}
	
	public static void testA1(PrintWriter out) {
		ArrayList <Person> a1 = Personen.createTestPersonliste();
		Collections.sort(a1);
		Personen.printPersons(a1, out);
//		out.print(a1);
	}
	
	public static void testA2(PrintWriter out) { //weshalb Klassenname ein Objekt
		ArrayList <Person> a2 = Personen.createTestPersonliste(); //sortiermethode sort hole
		a2.sort(new NameComparator());
		Personen.printPersons(a2, out);
//		out.print(a2);
	}

	public static void testA3(PrintWriter out) {
		ArrayList <Person> a3 = Personen.createTestPersonliste();
		a3.sort(new YearComparator());
		Personen.printPersons(a3, out);
//		out.print(a3);

	}
	public static void testA4(PrintWriter out) {
		ArrayList <Person> a4 = Personen.createTestPersonliste();
		a4.sort(PersonCompare::byName);
		a4.sort(PersonCompare::byVorname);
		a4.sort(PersonCompare::byYear);
		Personen.printPersons(a4, out);
//		out.print(a4);
	}// comparator holt sich was von außen //comparable holt was von innen
}
