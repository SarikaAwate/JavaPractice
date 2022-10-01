package StringPrograms;

public class SwqapString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String str1="Sarika";
     String str2="Awate";
     //SarikaAwate
     
     System.out.println("Old String "+str1+" "+str2);
     String str3=str1+str2;
     int a=str1.length(); //5
     int b=str2.length();  //4
     int c=str3.length(); // 10
     str1=str3.substring((c+1)-a);
     System.out.println(str1);
     str2=str3.substring(0, c-b);
     System.out.println(str2);
	}

}
