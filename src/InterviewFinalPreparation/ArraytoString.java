package InterviewFinalPreparation;

import java.util.Arrays;
import java.util.Scanner;

public class ArraytoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       int a[]=new int[3];
      // String str="";
       Scanner sc =new Scanner(System.in);
        for (int i=1;i<3;i++)
        {
        	a[i]=sc.nextInt();
        }
        String str=Arrays.toString(a);
      //  StringBuilder sb=new StringBuilder(str);
      //  sb.append(str);
      System.out.println(str);
      
      String ary[]=str.split(",");
      for(int i=0;i<3;i++)
      {
      System.out.print(ary[i]);
      }
       

	}

}
