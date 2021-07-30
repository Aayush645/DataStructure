package DSA450.Arrays;
import java.util.*;

public class elementsAppearMoreThanNbyKTimes 
{

	public static void main(String[] args) 
	{
		int arr[]= {1,3,3,2,3,2,3,2};
		int n=arr.length;
		int k=4;
		
		int x=n/k;

		HashMap<Integer,Integer> mp=new HashMap<>();
		
		for(int i=0;i<n;i++)
		{
			if(!mp.containsKey(arr[i]))
			{
				mp.put(arr[i],1);
			}
			else
			{
				int count=mp.get(arr[i]);
				mp.put(arr[i],count+1);
			}
		}
		
		
		for(Integer s:mp.keySet())
		{
			int temp=mp.get(s);
			if(temp>x)
			{
				System.out.print(s+" ");
			}
		}
		
		
		
		
		
	}

}
