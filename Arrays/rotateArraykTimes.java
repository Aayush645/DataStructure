package DSA450.Arrays;

public class rotateArraykTimes 
{
	
	public static void rotate(int a[],int l,int r)
	{
		while(l<r)
		{
			int temp=a[l];
			a[l]=a[r];
			a[r]=temp;
			l++;r--;
		}
	}
	
	public static void anticlockwise(int a[],int n,int k)
	{
		if(k==0 || k%n==0)
		{
			for(int i=0;i<a.length;i++)
			{
				System.out.print(a[i]+" ");
			}
			return;
		}
		k=k%n;
		rotate(a,0,k-1);
		rotate(a,k,n-1);
		rotate(a,0,n-1);
		
		System.out.println("\nAntiClockwise Rotation: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

	public static void clockwise(int a[],int n,int k)
	{
		if(k==0 || k%n==0)
		{
			for(int i=0;i<a.length;i++)
			{
				System.out.print(a[i]+" ");
			}
			return;
		}
		k=k%n;
		
		rotate(a,n-k,n-1);
		rotate(a,0,n-k-1);
		rotate(a,0,n-1);
		
		System.out.println("Clockwise Rotation: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	
	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5,6,7};
		int n=a.length;
		int k=3;
		clockwise(a,n,k);   //Using reverse algorithm
		
		System.out.println();
		int a1[]= {1,2,3,4,5,6,7};
		n=a1.length;
		k=3;
		anticlockwise(a1,n,k);  //Using reverse algorithm

	}

}
