package Collection;

import java.util.*;


public class ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List al=new java.util.ArrayList<>();
		//to add element add method is used
		al.add("sarika");
		al.add("sam");
		al.add("welcome");
		al.add(4);
		al.add(7);
		System.out.println("List"+al);
		//for loop
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		//for each loop
		for (Object s:al)
		{
			System.out.println(s);
		}
		//Iterator 
		Iterator itr=al.iterator();
	    while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
		
	}

}
