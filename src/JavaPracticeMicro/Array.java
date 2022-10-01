package JavaPracticeMicro;



public class Array {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
	/*	int a[]= {12,12,34,56};
		for(int i=0;i<a.length;i++)
				{
			
			System.out.println(a[i]);
				}
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter number of element in array");
		int n=sc.nextInt();
		int b[]=new int[n];
		for(int i=0;i<n;i++)
		{
			b[i]=sc.nextInt();
			
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(b[i]);
			
		}
		for(int i:b)
		{
			System.out.println(i);
		}*/
		int x[]= {12,34,56};
		int y[]= {12,34,56};
		int z[]=new int[3];
		for (int i=0;i<x.length;i++)
	{
		 z[i]=x[i]-y[i];

	}
		
		for (int i=0;i<x.length;i++)
		{
			System.out.println(z[i]);

		}
			

}
}
