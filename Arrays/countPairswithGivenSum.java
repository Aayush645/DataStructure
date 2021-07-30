package DSA450.Arrays;

import java.util.*;

public class countPairswithGivenSum {

	public static void main(String[] args) 
	{
		int arr[]= {1,5,7,1};
		int n=arr.length;
		int k=6;
		
		
		//Naive Solution
//		for(int i=0;i<n;i++)
//		{
//			for(int j=0;j<n && j!=i;j++)
//			{
//				if(arr[i]+arr[j]==k)
//				{
//					count++;
//				}
//			}
//		}
//		
//		System.out.println("Number of Pairs are: "+count);
		
		//Optimised Solution
		
		Map<Integer,Integer> mp=new HashMap<>();
		
		for(int i=0;i<n;i++)
		{
			mp.put(arr[i], 0);
		}
		
		for(int i=0;i<n;i++)
		{
			mp.put(arr[i],mp.get(arr[i])+1 );
		}
		
		int count=0;
		for(int i=0;i<n;i++)
		{
			if(mp.containsKey(k-arr[i]))
			{
				count=count+mp.get(k-arr[i]);
			}
			
			if((k-arr[i])==arr[i])
			{
				count--;
			}
		}
		
		System.out.println(count/2);
		
	}

}
