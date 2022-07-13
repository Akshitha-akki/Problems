package PROBLEMS;

class AreaRectangle
{
	int l=2,result;
	AreaRectangle(int l,int w)
	{
		result=l*w;
		return;
	}
	void display()
	{
		System.out.println("Area of Rectangle : "+result);
	}
}
class ParimerterRectangle extends AreaRectangle
{
	int width,length,result1;
	ParimerterRectangle(int l, int w)
	{
		super(2,2);//Invoking the Parent class Constructor using super.
		length=l;
		width=w;
	}
    void display()
    {
	     //Invoking method using the super.
	     	super.display();
	     //Invoking Variable using super from the parent class
	     	System.out.println("Perimeter of Rectangle : "+(2*(super.l+width)));	     	
    }
}
public class Super {

	public static void main(String[] args) 
	{
		ParimerterRectangle obj=new ParimerterRectangle(1, 1);
		obj.display();
	}

}
