
public class person {

	private String name;
	private int birthYear;
	
	public void makePerson (String personName, int personBirthYear)
	{
		name = personName;
		birthYear = personBirthYear;
	}
	
	public String toString()
	{
	      return "Person[name=" + name + ",birthYear=" + birthYear + "]";
	}

}
