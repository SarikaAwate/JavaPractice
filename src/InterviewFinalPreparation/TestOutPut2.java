package InterviewFinalPreparation;

public class TestOutPut2 {
	public static void main(String arg[])
	{
	int x=3,y=5,z=10;
	
//	int n= (++z)+y-y+z+(x++);
	//11+(5-5)+11+3=25

	//int n=++z+z;   //11+11=22
	
	int n=x+x++;  //3+3 =6   //x=4
	System.out.println(x);
	
	System.out.print(n);
	
	 
	}

}
