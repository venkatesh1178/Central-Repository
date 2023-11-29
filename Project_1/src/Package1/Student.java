package Package1;

public class Student {
	int rollno;
	public void Display1()
	{
		System.out.println("Welcome to all of you");
	}
    int age;
    public void Display2()
    {
    	System.out.println("Automation is very easy");
    }
    public static void main(String[] args)
    {
    	Student S1=new Student();
    	S1.Display1();
    	S1.Display2();
    	S1.rollno=12;
		S1.age=28;
    	System.out.println("Value of rollno"+S1.rollno);
    	System.out.println("Value of age"+S1.age);
    	
    }
}
