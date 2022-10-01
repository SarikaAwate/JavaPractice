package InterviewFinalPreparation;

public class FactorialUsingFunction {
	public static void main(String arg[])
	{
	//	int num=10;
		//public static int fact(num);
		int factorial=fact(3);
		System.out.println(factorial);
	}
	public static int fact(int num)
	{
		int	fact=1;
		for(int i=1;i<=num;i++)
		{
		   fact=fact*i;
			
		}
		System.out.println(fact);
		return fact;
	}

}
