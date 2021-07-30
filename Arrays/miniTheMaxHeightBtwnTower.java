package DSA450.Arrays;

import java.util.Arrays;

public class miniTheMaxHeightBtwnTower 
{
	public static void mini(int a[],int n,int k)
	{
		Arrays.sort(a);
		int ans=a[n-1]-a[0];
		
		int smallest=a[0]+k;
		int largest=a[n-1]-k;
		int curr_min;
		int curr_max;
		for(int i=0;i<n-1;i++)
		{
			curr_max=Math.max(largest,a[i]+k);
			curr_min=Math.min(smallest,a[i+1]-k);
			if(curr_min<0)
			{
				continue;
			}
			ans=Math.min(ans,curr_max-curr_min);
		}
		
		System.out.println("Answer is: "+ans);
	}

	public static void main(String[] args) 
	{
		int a[]= {1,15,10};
		int k=6;
		int n=a.length;
		
		mini(a,n,k);

	}

}
