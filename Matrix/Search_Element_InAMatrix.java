package DSA450.Matrix;

public class Search_Element_InAMatrix 
{
	
	public static void search(int arr[][],int r,int c,int target)
	{
		int rr=0;
		for(int i=0;i<r;i++)
		{
			if(arr[i][0]<=target && arr[i][c-1]>=target)
			{
				rr=i;
				break;
			}
		}
		
		if(binarySearch(arr,rr,0,c-1,target))
		{
			System.out.println("Present");
		}
		else
		{
			System.out.println("Absent");
		}
		
	}
	
	public static boolean binarySearch(int arr[][],int rr,int l,int h,int target)
	{
		int mid;
		
		while(l<=h)
		{
			mid=l+((h-l)/2);
			
			if(arr[rr][mid]==target)
			{
				return true;
			}
			else if(arr[rr][mid]<target)
			{
				return binarySearch(arr,rr,mid+1,h,target);
			}
			else
			{
				return binarySearch(arr,rr,l,mid-1,target);
			}
		}
	
		return false;
	}

	public static void main(String[] args)
	{
		int arr[][]={	{1, 2, 3, 4},
						{5, 6, 7, 8},
						{9, 10, 11, 12},
						{13, 14, 15,16}	};
		
		int r=arr.length;
		int c=arr[0].length;
		int target=8;
		
		search(arr,r,c,target);

	}

}
