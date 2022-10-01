package InterviewFinalPreparation;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int num=153;
      //  1^3+5^3+3^3=1+125+27=153   
        int temp=num;
        int sum=0,r,d;
        while(num>0)
        {
        	r=num%10;
        	num=num/10;
        	sum+=r*r*r;
        }
      	System.out.println(sum);
        if(temp==sum)
        {
        	System.out.println("Armstrong number");
        
        }
        else
        {
        	System.out.println("Not Armstrong number");
        }
	}

} 

