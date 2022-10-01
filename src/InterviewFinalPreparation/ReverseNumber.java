package InterviewFinalPreparation;

public class ReverseNumber {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int a=123,i=0;
		int rem=0,div;
		while(a>0)
		{
			rem=rem*10+a%10;
			div=a/10;
			a=div;
			i++;
		
		}
		System.out.print(rem);
		
	/*	StringBuilder sc=new StringBuilder(a);
		sc.append(a);
		System.out.println(sc.reverse());
		String sc1=sc.toString();
		System.out.print(sc1);*/
		
		/*StringBuffer sc=new StringBuffer(String.valueOf(a));
		StringBuffer sc1=sc.reverse();
		System.out.print(sc1);
*/
	}

}
