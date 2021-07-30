package DSA450.String;
import java.util.*;
public class Find_Duplicates {

	public static void find(String a,int n)
	{
		Map<Character,Integer> mp=new HashMap<>();
		
		for(int i=0;i<n;i++)
		{
			if(!mp.containsKey(a.charAt(i)))
			{
				mp.put(a.charAt(i),1);
			}
			else
			{
				mp.put(a.charAt(i),mp.get(a.charAt(i))+1);
			}
		}
		
		for(Map.Entry<Character,Integer> entry:mp.entrySet())
		{
			if(entry.getValue()>1)
			{
				System.out.print(entry.getKey()+" ");
			}
		}
	}
	
	
	public static void main(String[] args) 
	{
		String a="geeksforgeeks";
		int n=a.length();
		
		find(a,n);
	}

}
