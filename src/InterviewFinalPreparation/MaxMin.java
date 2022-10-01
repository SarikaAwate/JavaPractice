package InterviewFinalPreparation;

import java.util.Scanner;

public class MaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner Sc =new Scanner(System.in);
		int a[]= {12,34,56,78};
		int max=a[0];
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println(max);
		
		 for(int i=0;i<a.length;i++)
		 {
			 if(a[i]<min)
				min=a[i] ;
		 }
		 System.out.println(min);
	}

}
