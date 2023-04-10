package Students;

public class studentsOverloading {
    
	public void studentInfo()
	{
	  System.out.println("Student Info details");
	}
	
	public void studentInfo(int regnumber)
	{
		System.out.println(regnumber);
		
	}
	
	public String studentInfo(String name)
	{
		System.out.println(name);
		return name;
		
	}
	
	public void studentInfo(int termfees, int bookfees ) {
		int total = termfees+bookfees;
		System.out.println("Total fees = "+total);
	}
	public static void main(String[] args) {
		studentsOverloading s = new studentsOverloading();
		s.studentInfo();
		s.studentInfo(2032514);
		s.studentInfo("Devi");
		s.studentInfo(35000, 4500);
		

	}

}
