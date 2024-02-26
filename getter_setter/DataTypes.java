package getter_setter;
class Datas
{
	private int age=58;
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age=age;
		 
	}
	private float Weight=65.6f;
	public float getWeight()
	{
		return Weight;
	}
	public void setWeight(float Weight)
	{
		this.Weight=Weight;
		 
	}
	private double Salary=45000.787;
	public double getSalary()
	{
		return Salary;
	}
	public void setSalary(double Salary)
	{
		this.Salary=Salary;		 
	}
	private char Initial='R';
	public char getInitial()
	{
		return Initial;
	}
	public void setInitial(char Initial)
	{
		this.Initial=Initial;
		 
	}
	private boolean Indian=false;
	public boolean getIndian()
	{
		return Indian;
	}
	public boolean setIndian(boolean Indian)
	{
		return this.Indian=Indian;  
		 
	}
}

public class DataTypes {

	public static void main(String[] args)
	{
		Datas d1=new Datas();
		d1.setAge(35);
		System.out.println(d1.getAge());
		d1.setSalary(65067.778);
		System.out.println(d1.getSalary());
		d1.setWeight(76.5f);
		System.out.println(d1.getWeight());
		d1.setInitial('S');
		System.out.println(d1.getInitial());
		d1.setIndian(true);
		System.out.println(d1.getIndian());
		

	}

}
