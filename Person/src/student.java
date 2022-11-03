
public class student extends person {

	private String major;
	
	public void makeStudent (String studentMajor)
	{ 
		major = studentMajor;
	}
	
	public String toString()
	  {
	     return "Student[super=" + super.toString() + ",major=" + major + "]";
	  }
}
