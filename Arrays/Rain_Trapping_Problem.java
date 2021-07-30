package DSA450.Arrays;

public class Rain_Trapping_Problem 
{
	//2 Pointer Approach
	public static void find(int arr[],int n)
	{
		int l_max=arr[0];
		int r_max=arr[n-1];
		int l=1,r=n-2;
		int count=0;
		
		while(l<=r)
		{
			if(l_max<=r_max)
			{
				count+=Math.max(0,l_max-arr[l]);
				
				l_max=Math.max(l_max, arr[l]);
				l++;
			}
			else
			{
				count+=Math.max(0,r_max-arr[r]);
				
				r_max=Math.max(r_max, arr[r]);
				r--;
			}
		}
		
		System.out.println("Trapped Water is: "+count);
	}

	public static void main(String[] args) 
	{
		int a[]= {3, 0, 2, 0, 4};
		int n=a.length;
		
		find(a,n);

	}

}
