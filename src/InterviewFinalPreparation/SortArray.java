package InterviewFinalPreparation;

import java.util.Arrays;
import java.util.Scanner;



public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
int a[]= {12,34,5,6,4};

int n=a.length;
/*Arrays.sort(a);
for(int i=0;i<n;i++)
{
	System.out.println(a[i]+" ");
}*/

	for(int i=0;i<n;i++)
	{
		for(int j=i+1;j<n;j++)
		{
			if(a[i]>a[j])
			{
				int t=a[i];
				a[i]=a[j];
				a[j]=t;
			}
		}
	}
	System.out.println("Without sort method");
	for(int i=0;i<n;i++)
	{
		System.out.println(a[i]+" ");
	}
}
}
