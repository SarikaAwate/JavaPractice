package InterviewFinalPreparation;

public class TestOutput {
	public static void main(String Args[])
	{
		int i,j,k,l=0;
		k=l++;   //k=0; l=1
		j=++k;    //j=1, k=1
		i=j++ ;//i=1  ,j=2;
		
		System.out.println("i"+ " "+i );
		System.out.println("j"+ " "+j );
		System.out.println("k"+ " "+k );	
		
		int x=1;
		do
		{
			x--;
		}while(x>2);
		System.out.print("x:"+x);
		
	
	}

}
