package DSA450.Arrays;
import java.util.*;
public class sort012 
{
	public static void main(String args[])
	{
		
		//Method using priority Queue
		
//		int arr[]= {0, 2, 1, 2, 0};
//		int n=arr.length;
//		Queue<Integer> pq=new PriorityQueue<>();
//		for(int i=0;i<n;i++)
//		{
//			pq.add(arr[i]);
//		}
//		
//		while(!pq.isEmpty())
//		{
//			System.out.print(pq.peek()+" ");
//			pq.remove();
//		}
		int arr[]= { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };;
		int n=arr.length;
		int lo=0,mid=0,high=n-1,temp;
		
		while(mid<=high)
		{
			switch(arr[mid])
			{
			case 0: 	temp=arr[lo];
						arr[lo]=arr[mid];
						arr[mid]=temp;
						lo++;
						mid++;
						break;
			case 1:		mid++;
						break;
			case 2: 	temp=arr[high];
						arr[high]=arr[mid];
						arr[mid]=temp;
						high--;
			}
		}
		
		
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}

}
