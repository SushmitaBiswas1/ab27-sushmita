package scannerclass;

import java.util.Scanner;

public class Scanner_Methods {

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Provide String value");
		String a=s1.next();
		System.out.println("Provide int value");
		int b=s1.nextInt();
		System.out.println("Provide byte value");
		byte c=s1.nextByte();
		System.out.println("Provide short value");
		short d=s1.nextShort();
		System.out.println("Provide long value");
		long e=s1.nextLong();
		System.out.println("Provide float value");
		float f=s1.nextFloat();
		System.out.println("Provide double value");
		double g=s1.nextDouble(); 
		System.out.println("Provide boolean value");
		boolean h=s1.nextBoolean(); 
	}

}
