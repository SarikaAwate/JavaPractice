package InterviewFinalPreparation;

import java.util.Scanner;

public class PalindromNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		int rem=0,div,i=0,rev=0;
		//num=1221
		while(num>0)
		{
			rem=rem*10+num%10;
			div=num/10;
			num=div;
			//i++;
			
		}
		System.out.println(rem);
	
		if(num==rev)
		{
			System.out.println("Number is Palindrome");
		}
		else
		{
			System.out.println("Number is not Palindrome");
			
		}

	}

}
