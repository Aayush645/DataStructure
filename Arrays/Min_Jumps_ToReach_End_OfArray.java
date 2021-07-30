package DSA450.Arrays;

public class Min_Jumps_ToReach_End_OfArray 
{
	static int mem[]=new int[1000];
	
	public static int find(int arr[],int l,int h)
	{
		if(l==h)
			return mem[l]=0;
		if(arr[l]==0)
			return mem[l]=Integer.MAX_VALUE;
		
		if(mem[l]!=0)
		{
			return mem[l];
		}
		
		int ans=Integer.MAX_VALUE;
		for(int i=l+1;i<=h && i<=l+arr[l];i++)
		{
			int jumps=find(arr,i,h);
			if(jumps+1<ans && jumps!=Integer.MAX_VALUE)
			{
				ans=jumps+1;
			}
		}
		return mem[l]=ans;
		
	}

	public static void main(String[] args) 
	{
		int arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
		int n=arr.length;
		
		System.out.println("Minimum nuber of Jumps required: "+find(arr,0,n-1));

	}

}
