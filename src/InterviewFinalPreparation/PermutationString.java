package InterviewFinalPreparation;

import java.util.Scanner;

public class PermutationString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //ABC===ABC ACB   BCA   BAC   CAB   CBA
		//3=3*2*1=6
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter String");
		String a=Sc.next();
		permutation(a,"");
		
		
	}

	private static void permutation(String a, String string) {
		// TODO Auto-generated method stub
		if(a.length()==0)
		{
			System.out.println(string);
			return;
		}
		for(int i=0;i<a.length();i++)
		{
			Character b=a.charAt(i);
			String left= a.substring(0, i);
			String right=a.substring(i+1);
			String per=left+right;
			permutation(per,string+b);
			
			
		}
	}

}
