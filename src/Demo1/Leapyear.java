package Demo1;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub/Year-366 Days
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Leap year to check");
		int year=sc.nextInt();
		if((year%4==0)||(year%400==0)&&(year%100!=0))
		{
			System.out.println("leap year");
		}
		else
		{
			System.out.println("Not leap year");
		}	

	}

}
