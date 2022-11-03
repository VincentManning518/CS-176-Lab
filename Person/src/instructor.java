
public class instructor extends person{

	private int salary;
	
	public void makeInstructor (int instructorSalary)
	{
		salary = instructorSalary;
	}
	
	public String toString()
	   {
	      return "Instructor[super=" + super.toString() + ",salary=" + salary + "]";
	   }

}
