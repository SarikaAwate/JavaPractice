
package StringPrograms;

import java.util.Arrays;

public class StringPrograms {

	public static void main(String[] args) 
	{
		// Concatanation of two strings
		String first="Sarika";
		String Second="Awate";
		String Third="Sarika";
		String a=new String("abc");
		String b=new String("abc");
		 first=first+" "+Second;
		System.out.println(first);
		String CocOperation=first.concat(Second);
		System.out.println(CocOperation);
        System.out.println(first.length());
        System.out.println(Second.length());
        System.out.println(first.equals(Second));
        System.out.println(first==Third);
        System.out.println(a==b);
        int array[]= {1,2,3,4,5};
        String arraytoString=Arrays.toString(array);
        System.out.println(arraytoString);
        
        
	}

}
