package JavaPracticeMicro;

import java.util.Scanner;

 class calculation
{
	public int[] Input()
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		System.out.println("Enter Five Elements");
		for (int i=0;i<=5;i++)
		{
			a[i]=sc.nextInt();
		}
		for (int i=0;i<=5;i++)
		{
			System.out.println("Elements of Array A:" +a[i]);
		}
		
		return a;
	}
		 public int calculation(int a[])
		   {
			   int sum=0;
			  
			   for (int i=0;i<=5;i++)
			   {
				   sum=sum+a[i];
			   }
			   System.out.println("Addition::" +sum); 
			   return sum;
		   }
		 public void cube(int a)
		 {
			 int cube=a*a*a;
			 System.out.print("Cube:"+cube);
		 }
		public void IncreasingDecreasing(int a,int b,int c)
		{
			if(a<=b && b<=c)
			{
				System.out.println("Increasing order");
			}
			else if((c>=b && b>=a))
			{
				System.out.println("Decreasing order");
			}
			else
			{
				System.out.println("No order");
			}
		}
		public void PositiveNegative(int a) {
			if(a<0)
			{
				System.out.println("Negative");
			}
			else if(a>0){
				System.out.println("positive");
			}
			else
			{
				System.out.println("Zero");
			}
			
		}
	
}

 public class Demo extends calculation
{
	public static void main(String arg[])
	{
	
		Demo d=new Demo();
	// Find Sum of the given number;
	//	d.calculation(d.Input());
	//find Cube of the number
	//	Scanner sc=new Scanner(System.in);
	//	System.out.println("Enter Number to find cube ");
	//	int a=sc.nextInt();
	//	d.cube(a);
	//Find the increseing & Descring order number
	//	d.IncreasingDecreasing(25, 21, 8);
		d.PositiveNegative(-9);
		

	}
	
}
