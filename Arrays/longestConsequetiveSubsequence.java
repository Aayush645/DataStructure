package DSA450.Arrays;

import java.util.*;


public class longestConsequetiveSubsequence {

	public static void main(String[] args) 
	{
		
		
		int arr[]={ 1, 2, 5, 4, 10, 11, 12 };
		int n=arr.length;
		
		// Below solution is O(nlogn)
		
//		Arrays.sort(arr);
//		int count=1,max=0;
//		for(int i=1;i<n;i++)
//		{
//			if(arr[i]==arr[i-1]+1)
//			{
//				count++;
//			}
//			else if(arr[i]==arr[i-1])
//			{
//				continue;
//			}
//			else
//			{
//				max=Math.max(count,max);
//				count=1;
//			}
//			max=Math.max(count,max);
//		}
//
//		System.out.println(max);
		
		
		// Below Solution is O(n)
		
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		
		for(int i=0;i<n;i++)
		{
			pq.add(arr[i]);
		}
		
		int max=0;
		int max_so_far=1;
		
		int prev=pq.poll();
		
		while(!pq.isEmpty())
		{
			if((pq.peek()-prev)==1)
			{
				max_so_far++;
				prev=pq.poll();
			}
			else if((pq.peek()-prev)==0)
			{
				prev=pq.poll();
			}
			else
			{
				max_so_far=1;
				prev=pq.poll();
			}
			
			if(max<max_so_far)
			{
				max=max_so_far;
			}
		}
		System.out.println("Answer is: "+max);
	}

}
