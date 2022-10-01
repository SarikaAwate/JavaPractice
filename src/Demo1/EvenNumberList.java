package Demo1;

import java.util.Scanner;

public class EvenNumberList 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Limit of list");
		int limit=sc.nextInt();
		int a[]=new int[limit];
		for(int i=0;i<limit;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<limit;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
			}
		}
	}
}

