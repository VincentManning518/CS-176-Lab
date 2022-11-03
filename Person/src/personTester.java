
public class personTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
	       * p1 is a Person "John" born in 1965
	       * p2 is a Person "Mary Ann" born in 1970
	       * s1 is a Student "Ann" born in 1982 and is a "Computer Science" major
	       * s2 is a Student "Thomas" born in 1986 and is a "Biology" major
	       * i1 is an Instructor "Joseph" born in 1954 earning 65000
	       * Enter lines of code below to instantiate these objects:
	       */
		
		person p1 = new person();
		p1.makePerson("John", 1965);
		
		person p2 = new person();
		p2.makePerson("Mary Ann", 1970);
		
		student s1 = new student();
		s1.makePerson("Ann", 1982);
		s1.makeStudent("Computer Science");
		
		student s2 = new student();
		s2.makePerson("Thomas", 1986);
		s2.makeStudent("Biology");
		
		instructor i1 = new instructor();
		i1.makePerson("Joseph", 1954);
		i1.makeInstructor(65000);
		
		System.out.println(p1.toString());
	      System.out.println("Expected: Person[name=John,birthYear=1965]");
	      System.out.println("");
	      
	      System.out.println(p2.toString());
	      System.out.println("Expected: Person[name=Mary Ann,birthYear=1970]");
	      System.out.println("");
	      
	      System.out.println(s1.toString());
	      System.out.println("Expected: Student[super=Person[name=Ann,birthYear=1982],major=Computer Science]");
	      System.out.println("");
	      
	      System.out.println(s2.toString());
	      System.out.println("Expected: Student[super=Person[name=Thomas,birthYear=1986],major=Biology]");
	      System.out.println("");
	      
	      System.out.println(i1.toString());
	      System.out.println("Expected: Instructor[super=Person[name=Joseph,birthYear=1954],salary=65000.0]");
	}

}
