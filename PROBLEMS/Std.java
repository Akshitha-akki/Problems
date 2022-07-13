package PROBLEMS;
import java.util.*;

class University
{
	String university;
	void university_name(String u)
	{
		university=u;
	}
}
class College extends University
{
	String College;
	void College_name(String c)
	{
		College=c;
	}
}
class StudentsDetails extends College
{
	public String Student;
	void Student_name(String s)
	{
		Student=s;
	}
	void display_StudentsDetails()
	{
		System.out.println("\nUniversity name : "+university);
		System.out.println("College name : "+College);
		System.out.println("Students name : "+Student);
	}
}
public class Std extends StudentsDetails {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Std obj=new Std();
		System.out.print("Enter the Unversity name :");
		String u=scan.nextLine();
		System.out.print("Enter the College name :");
		String c=scan.nextLine();
		System.out.print("Enter the Student name :");
		String s=scan.nextLine();
		obj.university_name(u);
		obj.College_name(c);
		obj.Student_name(s);
		obj.display_StudentsDetails();
	}

}
