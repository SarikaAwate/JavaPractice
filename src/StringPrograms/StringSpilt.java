package StringPrograms;

public class StringSpilt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Sarika,Amol,Sam,Arnav";
		String[] str1=str.split(",");
		System.out.println(str1);
		/*for(int i=0;i<str.length();i++)
				{
			System.out.println(str1);
				}*/
	for (String string : str1) {
		System.out.println(string);
	}
		
	}

}
