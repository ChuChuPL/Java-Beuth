package pr1.a10;

public class Person implements Comparable <Person>{ //comparable holt was von innen

	protected String vorname;
	protected String nachname;
	protected int geburtsjahr;
	
	public Person(String vorname, String nachname, int geburtsjahr) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.geburtsjahr = geburtsjahr;
	}
	public Person (Person p) {
		this(p.vorname, p.nachname, p.geburtsjahr);
	}
	public Person(schimkat.berlin.lernhilfe2019ws.objectPlay.Person p) { //Typkonv K
		this(p.getVorname(), p.getNachname(), p.getGeburtsjahr());
	}
	public String getVorname() {
		return vorname;
	}
	public String getNachname() {
		return nachname;
	}
	public int getGeburtsjahr() {
		return geburtsjahr;
	}
	public String toString() { //String.format benutzen
		return String.format("%s %s %d", vorname, nachname, geburtsjahr);
//		return vorname +' ' +nachname  +' ' +geburtsjahr;
	}
	
	public int compareTo(Person other) { //neu
		return nachname.compareTo(other.getNachname()); //vergleiche den nachnamen mit nachnamen aus woanders
	}
	
	public int hashCode() {
		final int prime = 31;
		int result= 1;
		result = prime * result + geburtsjahr;
		result = prime * result + ((nachname == null) ? 0 : nachname.hashCode());
		result = prime * result + ((vorname == null) ? 0 : vorname.hashCode());
		return result;
	}
	public boolean equals(Object obj) {
		if (this==obj) 
			return true;
		if (obj==null)
			return false;
		if(getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if(geburtsjahr != other.geburtsjahr)
			return false;
		if(nachname==null) {
			if(other.nachname != null)
				return false;
			} else if (!nachname.equals(other.nachname))
				return false;
		if(vorname==null) {
			if (other.vorname !=null)
				return false;
		} else if (!vorname.equals(other.vorname))
			return false;
		return true;
	}
	
	
}
