package InterviewFinalPreparation;



public class OccaranceOfCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="This is my testing job";
		int len=str.length();
		System.out.println(len);
		char c='i';
		int count=0;
		long f=123456789078L;
		for(int i=0;i<=len;i++)
		{
			System.out.println(str.charAt(i));
			char b=str.charAt(i);
			if(b==c) 
			{
				
				count++;
			}
		}
		System.out.println(count);
		
	/*	//Second Method
		String rep=str.replaceAll("i","");
		int leng_rep=rep.length();
		int count=len-leng_rep;
		System.out.println(count);*/

	}

}
