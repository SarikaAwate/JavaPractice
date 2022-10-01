package InterviewFinalPreparation;

import java.util.Scanner;

public class Fibonaccie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 0 1 1 2 3 5 ...
		
		int i=0,j=1;
		System.out.println("Enter how number required in fibonacci series");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.print(i+" "+j);
		for(int k=1;k<=(n-2);k++)
		{
			 int sum=i+j;
			 System.out.print(" "+sum);	
			 i=j;
			 j=sum;
			
				
		}

	}

}
