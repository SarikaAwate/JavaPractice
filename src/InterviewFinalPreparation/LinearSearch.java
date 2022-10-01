package InterviewFinalPreparation;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,13,56,78,90};
		int len=a.length;
		int search=56;
		boolean flag = false;
		for(int i=1;i<=len;i++)
		{
			if(search==a[i])
			{
				System.out.println("Element Found at index:"+i);
				flag=true;
				break;
			}
		}
		if(flag==false)
		{
			System.out.println("Element not found");
		}

	}

}
