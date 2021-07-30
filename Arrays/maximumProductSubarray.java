package DSA450.Arrays;

public class maximumProductSubarray {

	public static void main(String[] args) 
	{
		int arr[] = {-1, -2, -3, 4};
		int n=arr.length;
		
		int max_f=Integer.MIN_VALUE, max_b=Integer.MIN_VALUE;
		boolean zeroPresent=false;
		int max_so_far=1;
		
		for(int i=0;i<n;i++)
		{
			max_so_far=arr[i]*max_so_far;
			if(arr[i]==0)
			{
				zeroPresent=true;
				max_so_far=1;
				continue;
			}
			max_f=(max_f<max_so_far)?max_so_far:max_f;
		}
		
		max_so_far=1;
		
		for(int i=n-1;i>=0;i--)
		{
			max_so_far=arr[i]*max_so_far;
			if(arr[i]==0)
			{
				zeroPresent=true;
				max_so_far=1;
				continue;
			}
			max_b=(max_b<max_so_far)?max_so_far:max_b;
		}
		
		if(zeroPresent)
		{
			System.out.println(Math.max(Math.max(max_f, max_b),0));
		}
		else
		{
			System.out.println((Math.max(max_f, max_b)));
		}
	}

}
