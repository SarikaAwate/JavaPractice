package InterviewFinalPreparation;

import java.util.Arrays;

public class Anagram {
	public static void main(String arg [])
	{
	   String str1="java";
	   String str2="ajva";
	   int count=0;
	   for(int i=0;i<str1.length();i++)
	   {
		   for(int j=0;j<str2.length();j++)
		   {
			   if(str1.charAt(i)==str2.charAt(j))
			   {
				   count++;
			   }
		   }
		   if (count==3)
		   {
			   System.out.println("Anagram");
		   }
	   }
	/*  char[] str1_charArry=str1.toCharArray();
	  
	  char[] str2_charArry=str2.toCharArray();
	  Arrays.sort(str1_charArry);
	  Arrays.sort(str2_charArry);
	  if(Arrays.equals(str1_charArry,str2_charArry))
	  {
		  System.out.println("Anagram");
	  }
	  else
	  {
		  System.out.println("Not Anagram");
	  }*/

	}

}

