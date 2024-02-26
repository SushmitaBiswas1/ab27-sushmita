package scannerclass;

import java.util.Scanner;

//Find the Area of Triangle using Scanner Class
public class Assignment4 {

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the base value");
		double b=s1.nextDouble();
		System.out.println("Enter the perpendicular hieght value");
		double h=s1.nextDouble();
		double area=0.5*b*h; //(1/2*b*h)
		System.out.println("Area of Triangle is:" +area);
		

	}

}
