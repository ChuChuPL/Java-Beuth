package pr1.a10;

import java.util.Comparator;

public class NameComparator implements Comparator <Person>{// comparator holt sich was von außen

	public int compare(Person p1, Person p2) {
		return p1.getNachname().compareTo(p2.getNachname());
	}
}
