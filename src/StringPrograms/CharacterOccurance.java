package StringPrograms;



public class CharacterOccurance 
{
	public static void main(String arg[]) 
	{
		java.util.Scanner sc=new java.util.Scanner(System.in);
		String a=sc.next();
		int len=a.length();
		int count=0;
		for(int i=0;i<len;i++)
		{
			if(a.charAt(i)=='a')
			{
				count++;
			}
		}
		System.out.println("Count::::"+count);
	}

}
