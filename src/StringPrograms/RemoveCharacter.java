package StringPrograms;

public class RemoveCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="This is Sarika";
		System.out.println(removeChar(str, 5));

	}
	public static String removeChar(String s,int n)
	{
		return 	s.substring(0,n)+s.substring(n+1);
		
	}

}
