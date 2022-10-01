package InterviewFinalPreparation;



public class SwapNumber 
{
	public static void main(String arg[])
	{
		int a,b;
		java.util.Scanner sc= new java.util.Scanner(System.in);
		System.out.println("Enter First number:");
		a=sc.nextInt();
		System.out.println("Enter Second number:");
		b=sc.nextInt();
	/*	//using third varibale
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("A:"+a+" B:"+b);*/
		
	/*	//using + & -
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("A:"+a+" B:"+b);*/
		
	/*	//using * & /
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("A:"+a+" B:"+b);*/
		
	/*	//using ^
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("A:"+a+" B:"+b);*/
		
		//using single statement;
		
		b=a+b-(a=b);
		System.out.println("A:"+a+" B:"+b);
		
		
	}

}
