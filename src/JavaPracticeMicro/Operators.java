package JavaPracticeMicro;

public class Operators {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		int a =61,b=30;
		System.out.println("A:"+ a); //61
		System.out.println("B:"+ b);  //30
	/*	int Sum=a+b;
		int Sub=a-b;
		int div=a/b;
		int mul=a*b;
		int moudulo =a%b;
		System.out.println(Sum); //91
		System.out.println(Sub);  //31
		System.out.println(div);  //2
		System.out.println(mul);  //1830
		System.out.println(moudulo);//1
		
		int p=a++;  
		System.out.println(p);  //61
		System.out.println(a);   //62    */
		
		int q=a--;   ///a value is first assigned to q then it decrement by 1
		System.out.println(q);  //61
		System.out.println(a);   //60	
		
		System.out.println(a++); //60    //firt print value of a then it increment by  1
		System.out.println(a);   //61
		
		int c=++b;  //b=30
		System.out.println(c);//31
		System.out.println(b);  //31
		
		int d=--b;   //b=31
		System.out.println(d); //30
		System.out.println(b);  //30
		
		System.out.println(b--);  //30  print 30 then decrement by 1 b=29
		System.out.println(--b);   //28
	}

}
