package arrays_;

public class CalculateAverage {

	public static void main(String[] args) 
	{
		int[] num=new int[4];
		num[0]=20;
		num[1]=30;
		num[2]=49;
		num[3]=50;
		int sum=0;
		for(int i=0;i<num.length;i++) //num.length=size of the array
		{
			sum=sum+num[i];
		}
		System.out.println("sum is:"+sum);
		double avg=sum/num.length;
		System.out.println("Average is:" +avg);
		double remainder=sum%num.length;
		System.out.println("Remainder is:" +remainder); 
		

	}

}
