package JavaPracticeMicro;



class Compare
{
	

	public void largestElement(int i, int j, int k) 
	{
		
		if(i>=j && i>=k)
		{
			System.out.println("Geater Element is:"+i);
		}
		else if((j>=i && j>=k))
		{
			System.out.println("Geater Element is:"+j);
		}
		else if((k>=i && k>=j))
		{
			System.out.println("Geater Element is:"+k);
		}
	}
	
}
public class LargestMethod 
{ 

	public static void main(String[] args) 
	{
		java.util.Scanner sc =new java.util.Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
	   Compare cm=new Compare();
	   cm.largestElement(a,b,c);

	}

}
