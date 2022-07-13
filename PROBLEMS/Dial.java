package PROBLEMS;
import java.util.*;
public class Dial implements NotLeft,CallLeft
{
	public void call()
	{
		 System.out.println(Call.left);	
	}
	public void not() 
	{
		System.out.println(Call.not_left);		
	}
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		Dial obj=new Dial();
		int i=0;
		   while(i<=100)
		   {
				System.out.println("Enter 1 or 0");
				int call=scan.nextInt();
				if(call==1)
				{
					obj.call();
					System.out.println();
				}
				else if(call==0)
				{
					obj.not();
					System.out.println();
				}
				else
				{
					System.out.println("Invalid number");
					System.exit(0);
				}
				i++;
		   }
	scan.close();
	}
}
