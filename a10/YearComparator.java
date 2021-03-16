package pr1.a10;

import java.util.Comparator;

public class YearComparator implements Comparator <Person>{
	
	public int compare(Person p1, Person p2) {
		return p1.getGeburtsjahr()-p2.getGeburtsjahr();
	}
}
