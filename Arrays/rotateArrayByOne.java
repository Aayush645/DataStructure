package DSA450.Arrays;

public class rotateArrayByOne {

	public static void main(String[] args)
	{
		int a[]= {1,2,3,4,5};
		int n=a.length;
//		
//		int ans[]=new int[2*n];
//		for(int i=0;i<ans.length;i++)
//		{
//			ans[i]=a[i%n];
//		}
//		
//		for(int i=n-k;i<n-k+n;i++)
//		{
//			System.out.print(ans[i]+" ");
//		}
		
		int temp=a[n-1];
		for(int i=n-1;i>=1;i--)
		{
			a[i]=a[i-1];
		}
		a[0]=temp;
		
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}

}
