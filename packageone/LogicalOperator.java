package packageone;

public class LogicalOperator {

	public static void main(String[] args) 
	{
		/* AND Operator */
		int a=10;
		int b=20;
		if(a>=10 && b==20) //True and True => True
		{
			System.out.println("AND Operator"); //Output
		}
		/* OR Operator */
		int c=10;
		int d=20;
		if(c>=10 || d==10) // true or false => True
		{
			System.out.println("OR Operator"); // Output
		}
		if(c>=100 || d==10) // false or false => False
		{
			System.out.println("OR Operator"); 
		}
		System.out.println("I am out of if block"); // Output
		/* AND NOT Operator */
		int e=10;
		int f=20;
		if (!(e>6 && f>10)) // (Not(True)) => False
		{
			System.out.println("And NOT Operator"); //as the condition is false, it won't enter the if block
		}
		if (!(e<6 || f<10)) // (Not(False)) => True
		{
			System.out.println("OR Not Operator");	//Output		
		}

	}

}
