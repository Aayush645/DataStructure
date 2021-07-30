package DSA450.Arrays;

public class Median_Of_TwoSorted_Arrays_DiffrentSize 
{
	
	public static int median(int arr[],int n)
	{
		if(n%2==0)
		{
			int temp=arr[n/2]+arr[(n/2)-1];
			return temp/2;
		}
		else
		{
			return arr[n/2];
		}
	}
	
	public static void findMedian(int a[],int n,int b[],int m)
	{
		if(n==0)
		{
			System.out.println(median(b,m));
		}
		
		int l=0,h=n,cut1,cut2,l1,l2,r1,r2,count=0;
		System.out.println("AAYush");
		while(l<=h)
		{
			count++;
			cut1=(l+h)/2;
			cut2=((n+m)/2)-cut1;
			l1=(cut1==0)?Integer.MIN_VALUE:a[cut1-1];
			l2=(cut2==0)?Integer.MIN_VALUE:b[cut2-1];
			r1=(cut1==0)?Integer.MAX_VALUE:a[cut1];
			r2=(cut2==0)?Integer.MAX_VALUE:b[cut2];
			
			if(l1>r2)
			{
				h=cut1-1;
			}
			else if(l2>r1)
			{
				System.out.println("ji");
				l=cut1+1;
			}
			else
			{
				System.out.println("Hi");
				if((n+m)%2==0)
				{
					
					int ans=((Math.max(l1, l2))+(Math.min(r1, r2)))/2;
					System.out.println("median is: "+ans);
					return;
				}
				else
				{
					int ans=Math.min(r1,r2);
					System.out.println("median is: "+ans);
					return;
				}
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) 
	{
		 int ar1[] = {2, 3, 5, 8};
	     int  ar2[] = {10, 12, 14, 16, 18, 20};  
	     int n=ar1.length;
	     int m=ar2.length;
	      
	     if(n<m) 
	     {
	    	 findMedian(ar1,n,ar2,m);
	     }	
	     else
	     {
	    	 findMedian(ar2,m,ar1,n);
	     }
			
	     
	    

	}

}
