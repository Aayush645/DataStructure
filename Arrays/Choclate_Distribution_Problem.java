package DSA450.Arrays;

import java.util.Arrays;

public class Choclate_Distribution_Problem 
{ 
	public static void findMin(int arr[],int m,int n)
	{
		Arrays.sort(arr);
		int ans=Integer.MAX_VALUE;
		for(int i=0,j=m-1;j<n;i++,j++)
		{
			ans=Math.min(ans,arr[j]-arr[i]);
		}
		System.out.println("Answer is: "+ans);
	}

	public static void main(String[] args) 
	{
		int arr[] = {12, 4, 7, 9, 2, 23, 25, 41, 
				30, 40, 28, 42, 30, 44, 48, 
				43, 50};
		int m = 7 ;
		
		int n=arr.length;
		findMin(arr,m,n);

	}

}
