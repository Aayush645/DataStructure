package DSA450.Arrays;

public class Median_Of_Two_Sorted_Arrays_Of_SameSize 
{
	
	public static int getMedian(int a[],int b[],int startA,int startB,int endA,int endB)
	{
		if(endA-startA==1)
		{
			return (Math.max(a[startA], b[startB])+Math.min(a[endA], b[endB]))/2;
		}
		
		
		int m1=findMedian(a,startA,endA);
		int m2=findMedian(b,startB,endB);

		
		if(m1==m2)
		{
			return m1;
		}
		else if(m1<m2)
		{
			return getMedian(a,b,(endA+startA+1)/2,startB,endA,(endB+startB+1)/2);
		}
		else
		{
			return getMedian(a,b,startA,(startB+endB+1)/2,(endA+startA+1)/2,endB);
		}
	}
	
	public static int findMedian(int arr[],int start,int end)
	{
		int n=end+1-start;
		if(n%2!=0)
		{
			return (arr[start+(n/2)]);
		}
		else
		{
			int med=arr[start+(n/2)]+arr[start+((n/2)-1)];
			med=med/2;
			return med;
		}
	}

	public static void main(String[] args) 
	{
		int ar1[] = { 1, 12, 15, 26, 38 };
	    int ar2[] = { 2, 13, 17, 30, 45 };
	 
        int n1 = ar1.length;
        int n2 = ar2.length;
        if (n1 != n2) 
        {
            System.out.println("Doesn't work for arrays of unequal size");
        }
        else if (n1 == 0) 
        {
            System.out.println("Arrays are empty.");
        }
        else if (n1 == 1) 
        {
            System.out.println((ar1[0] + ar2[0]) / 2);
        }
        else {
            System.out.println("Median is "+ getMedian(ar1, ar2, 0, 0,ar1.length - 1, ar2.length - 1));
        }
    
	}

}
