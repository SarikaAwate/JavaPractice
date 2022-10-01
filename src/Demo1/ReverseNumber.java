package Demo1;



public class ReverseNumber {

	public static void main(String[] args) {
		
		java.util.Scanner myObj = new java.util.Scanner(System.in);
		System.out.println("enter number");
		int num=myObj.nextInt();
		//System.out.println(num);//1234
		/*int rev=0;
		while(num>0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println(rev);*/
		// String----immutable---
		//stringbuffer---mutable--synchronized--thread safe----less faster than string builder
		//String builder---mutable--not synchronized --not thread safe--faster than string buffer
		
		//String---new heap memory when using "" then string pool
		
		
		StringBuffer a=new StringBuffer();
		a.append(num);
	//String num2=a.toString();
	System.out.println(a.reverse());
		
		/*StringBuilder sb=new StringBuilder();
	  	sb.append(num);
	  System.out.println(sb.reverse());*/
	  
	}

}
