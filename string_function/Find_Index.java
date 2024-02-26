package string_function;

public class Find_Index {

	public static void main(String[] args) 
	{
		  int listofnumber[]= {78,89,100,41};
		  int rollnotocheck=41;
		  int temp=0;
			
			
			for(int i=0;i<=3;i++)
			{
				if(rollnotocheck==listofnumber[i])
				{
					System.out.println("Number is present at index:"+i);
					temp++;
				}
				
			}
			if(temp==0)
			{
				System.out.println("Number is not present in the array");
			}
			
	}

}
