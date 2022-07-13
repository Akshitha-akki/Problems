package PROBLEMS;
import java.util.*;
public class Calculate_Salary
{
	int savings;
	int calculateSal(int salary, int shifts)
	{
		if(salary<0)
		{
			System.out.println("Salary too small");
		}
	    else if(salary > 8000)
		{
			System.out.println("Salary too large");
		}
	    else if(shifts<0)
		{
			System.out.println("Shifts too small");
		}
	    else 
	    {
	    	savings=(int) (salary*(0.2+0.3)+(salary*shifts*0.02));
	    }
		return savings;	 
	}
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Salary");
		int salary=scan.nextInt();
		int shifts=scan.nextInt();
		Calculate_Salary obj=new Calculate_Salary();
		int output =obj.calculateSal(salary,shifts);
		System.out.println(output);
	}

}
