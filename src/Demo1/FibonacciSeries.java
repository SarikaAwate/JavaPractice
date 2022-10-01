package Demo1;

public class FibonacciSeries {

	public static void main(String[] args) 
	{
		//0 1 1 2 3 5 8 13.....
		int a=0,b=1;
		int temp;
		System.out.print(a +" "+b);
		for(int i=1;i<=(12-2);i++)
		{
			temp=a+b;
			System.out.print(" "+ temp);
			a=b;
			b=temp;
			//System.out.print(" "+ b);	
		}

	}

}
