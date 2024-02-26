package arrays_;

import java.util.Arrays;

//Create an array of length 4 and copy its value in another array using iteration
public class Arrays_ex2 {

	public static void main(String[] args)
	{
		int rollno[]=new int[4];
		rollno[0]=45;
		rollno[1]=22;
		rollno[2]=30;
		rollno[3]=55;
		int rn[]=new int[4];
		for(int i=0;i<4;i++)
		{
			rn[i]=rollno[i]; //copying one array values to another array
		}
		System.out.println("Original roll numbers:" +Arrays.toString(rollno));
		System.out.println("Copied roll numbers:"+Arrays.toString(rn));
		Arrays.sort(rn);
		System.out.println("Sorted roll numbers:"+Arrays.toString(rn)); //to sort the numbers


	}

}
