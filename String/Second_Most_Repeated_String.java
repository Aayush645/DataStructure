package DSA450.String;
import java.util.*;
public class Second_Most_Repeated_String 
{
	public static void find(String arr[],int n)
	{
		Map<String,Integer> mp=new HashMap<>();
		
		for(int i=0;i<n;i++)
		{
			if(!mp.containsKey(arr[i]))
			{
				mp.put(arr[i],1);
			}
			else
			{
				mp.put(arr[i],mp.get(arr[i])+1);
			}
		}
		
		int f=Integer.MIN_VALUE+1;
		int s=Integer.MAX_VALUE;
		String ans="";
		for(Map.Entry<String,Integer> entry:mp.entrySet())
		{
			if(entry.getValue()>f)
			{
				s=f;
				f=entry.getValue();
			}
			else if(entry.getValue()<f && entry.getValue()>s)
			{
				s=entry.getValue();
			}
			else
			{
				continue;
			}
		}
		
		for(Map.Entry<String,Integer> entry:mp.entrySet())
		{
			if(entry.getValue()==s)
			{
				System.out.println(entry.getKey());
			}
		}
	
	}

	public static void main(String[] args) 
	{
		 String arr[] = { "bbb", "aaa", "ccc",
                 "ddd", "aaa", "aaa","bbb" };
		 int n=arr.length;
		 
		 find(arr,n);

	}

}
