package InterviewFinalPreparation;

public class ReverseString {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		String a="ABCD",rev="";
		
		int len=a.length();
		System.out.print(len);
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+a.charAt(i);
		
		}
		System.out.print(rev);
		

	}

}
