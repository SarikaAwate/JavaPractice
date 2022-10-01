package StringPrograms;

public class StringPalindrom 
{
	public static void main(String arg[]) 
	{
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter String");
		String a=sc.next();
		StringBuffer s=new StringBuffer();
		
		s.append(a);
		System.out.println(s.reverse());
		
		String b=s.toString();
		System.out.println(b);
		if(a.equalsIgnoreCase(b))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
		
		
	}
}
