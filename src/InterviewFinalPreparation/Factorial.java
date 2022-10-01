package InterviewFinalPreparation;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int num=4, fact=1;
       // 10*9*8
     /*  for(int i=1;i<=num;i++)
       {
    	   fact=fact*i;
       }
       System.out.println("factorial using Asending"+fact);*/
       
       for(int i=num;i>=1 ;i--)
       {
    	   fact=fact*i;
       }
       System.out.println("factorial using Desending: "+fact);
       
	}

}
