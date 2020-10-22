package assignment3_22;

import java.util.Scanner;
public class CheckInt {
	
	Scanner sc = new Scanner(System.in);
	public int num1;
	public int num2;
	public float avg;
	
	public void acceptNum()
	{
		System.out.println("Enter number1 : ");
		if(sc.hasNextInt())
			num1 = sc.nextInt();
		else
		{
			System.out.println("Enter valid integer");
			System.exit(0);
		}
		System.out.println("Enter number2 : ");
		if(sc.hasNextInt())
			num2 = sc.nextInt();
		else
		{
			System.out.println("Enter valid integer");
			System.exit(0);
		}
	}
	
	public void average()
	{
		avg = (float)(num1 + num2) /2;
		System.out.println("Average = "+avg);
	}

}
