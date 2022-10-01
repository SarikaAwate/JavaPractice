package Demo1;

public class StaicNonStatic {
	static int a;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaicNonStatic s=new StaicNonStatic();
		go2();
		go();
		s.go1();

	}
	 public static void go()
	 {
		 System.out.println("GO");
		 go2();
		a=5;
	 }
	 public void go1()
	 {
		 System.out.println("GO1");
	 }
	 public static  void go2()
	 {
		 System.out.println("GO2");
	 }
}
