package DSA450.Arrays;

import java.util.*;

public class subset_Of_Array 
{
	
	public static void isSubset(int a1[],int a2[],int n,int m)
	{
		Map<Integer,Integer> mp=new HashMap<>();
		
		for(int i=0;i<n;i++)
		{
			if(!mp.containsKey(a1[i]))
			{
				mp.put(a1[i],1);
			}
		}
		
		for(int i=0;i<m;i++)
		{
			if(!mp.containsKey(a2[i]))
			{
				System.out.println("Not a Subset");
				return;
			}
			else
			{
				continue;
			}
		}
		System.out.println("Subset");
		return;
	}

	public static void main(String[] args) 
	{
		int a1[] = {11, 1, 13, 21, 3, 7};
		int a2[] = {11, 3, 7, 1};
		int n=a1.length;
		int m=a2.length;
		
		isSubset(a1,a2,n,m);

	}

}
