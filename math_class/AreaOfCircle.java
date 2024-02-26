package math_class;

public class AreaOfCircle
{

	public static void main(String[] args) 
	{
		double pi=Math.PI;
		System.out.println("value of PI is: "+pi);
		for(int i=0;i<10;i++)
		{
			double r=Math.random();
			double area=pi*r*r;
			System.out.println("For Radius "+r+",area of Circle is: "+area); 
					
		}

	}

}
