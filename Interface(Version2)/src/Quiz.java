public class Quiz implements Measurable {

	private double grade;
	private String name;
	
	public Quiz (String name, double grade)
	{
		this.grade = grade;
		this.name = name;
	}
	
	public double getMeasure() 
	{
		return grade;
	}

}
