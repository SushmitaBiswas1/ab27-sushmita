package return_type;

public class Data_Types
{
	int add(int a,int b)
	{
		int sum=a+b;
		return sum;
		
	}
	double salary(double sal,int bonus)
	{
		double total=sal+bonus;
		return total;
	}
	float hike(float h)
	{
		float inc=h;
		return inc;
	}
	boolean answer(boolean a)
	{
		return a;
	}
	String name(String FN)
	{
		return FN;
	}
	

	public static void main(String[] args) 
	{
		Data_Types d1=new Data_Types();
		d1.add(100, 250);
		d1.answer(false);
		d1.hike(10);
		d1.salary(15000, 1000);
		d1.name("Sushmita Biswas");

	}

}
