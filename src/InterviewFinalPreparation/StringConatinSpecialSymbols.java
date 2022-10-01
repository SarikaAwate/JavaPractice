package InterviewFinalPreparation;

import java.util.Scanner;

public class StringConatinSpecialSymbols {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter String");
      String str=sc.next();
      System.out.println(str);
      char[] ar=str.toCharArray();
      char[] syb={'@','#'};
      for(int i=0;i<ar.length;i++)
      {
    	  if(ar[i]==syb[i])
    	  {
    		  System.out.print(ar[i]);
    	  }
      }
     
     
	}

}
