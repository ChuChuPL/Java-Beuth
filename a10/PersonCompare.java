package pr1.a10;

public class PersonCompare {
	
	public static int byName(Person p, Person q) {
		return p.getNachname().compareTo(q.getNachname());
	}
	
	public static int byVorname(Person p, Person q) {
		return p.getVorname().compareTo(q.getVorname());
	}

	public static int byYear(Person p, Person q) {
		return p.getGeburtsjahr()-q.getGeburtsjahr();
	}
}
