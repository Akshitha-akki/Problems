package PROBLEMS;
import java.util.*;
public class Maximum_sum {
//maximumSum method
	int maximumSum(int numbers[], int size) 
	{
		int SumEven=0,SumOdd=0;
			for(int i=0;i<size;i++)
			{
				if(numbers[i]%2==0)//Checking array.If elements are "Even" then ,sum up the elements
				{
					SumEven=SumEven+numbers[i];
				}
				else //Checking numbers array,If elements are "Odd" sum up the elements
				{
					SumOdd=SumOdd+numbers[i];
				}
			}
		//MAXIMUM SUM
		if(SumEven>SumOdd)
		{
			return SumEven;
		}
		else
		{
			return SumOdd;
		}
	}
//MAIN METHOD
		public static void main(String[] args) 
		{	
			Scanner scan=new Scanner(System.in);
		//SIZE
			System.out.println("Enter the Size of array");
			int size =scan.nextInt();
		//If the size is negative number then exit
			if(size<0)
			{
				System.out.println("Invalid array size");
				System.exit(0);
			}
		//Array - numbers
			int numbers[]=new int[size];
			System.out.println("Enter the array elements");
			for(int i=0;i<size;i++)
			{
				numbers[i]=scan.nextInt();
			}
		//If the array elements contains negative elements then exit or terminate
			for(int i=0;i<size;i++)
			{
				if(numbers[i]<0)
				{
					System.out.println("Invalid input");
					System.exit(0);
				}
			}
			//MaximumSum method
				Maximum_sum obj=new Maximum_sum();
				System.out.println(obj.maximumSum(numbers, size));
		}
}
