package PatternProgram;

public class pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for(int i=1;i<=3;i++)
        {
        	for(int j=3-i;j>=1;j--)
        	{
        		System.out.print(" ");
        	}
        	for (int k=1;k<=i;k++)
        	{
        		System.out.print("* ");
        	}
        	System.out.println();
        }
        for(int i=1;i<=2;i++)
        {
        	for(int j=1;j<=i;j++)
        	{
        		System.out.print(" ");
        	}
        
        	for(int k=2;k>=i;k--)
        	{
        		System.out.print("* ");
        	}
        	System.out.println();
        }
	}

}
