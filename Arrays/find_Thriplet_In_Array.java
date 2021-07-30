package DSA450.Arrays;

import java.util.Arrays;

public class find_Thriplet_In_Array
{
	
	public static void findTriplet(int a[],int sum,int n)
	{
		Arrays.sort(a);
		int l,r;
		for(int i=0;i<n-1;i++)
		{
			l=i+1;
			r=n-1;
			
			while(l<r)
			{
				if(a[i]+a[l]+a[r]==sum)
				{
					System.out.println(a[i]+" "+a[l]+" "+a[r]);
					l++;
					r--;
				}
				else if(a[i]+a[l]+a[r]<sum)
				{
					l++;
				}
				else
				{
					r--;
				}
					
			}
			
		}
	}

	public static void main(String[] args) 
	{
		int a[] = { 1, 4, 45, 6, 10, 8 };
        int sum = 22;
        int n=a.length;
        
        findTriplet(a,sum,n);

	}

}
