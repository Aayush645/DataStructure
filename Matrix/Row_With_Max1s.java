package DSA450.Matrix;

public class Row_With_Max1s 
{
	
	public static void find(int mat[][],int r,int c)
	{
		int max=Integer.MIN_VALUE,row=-1,numof1,ans;
		for(int i=0;i<r;i++)
		{
			ans=first(mat[i],0,c-1);
			if(ans==-1)
			{
				continue;
			}
			numof1=c-ans;
			
			if(max<numof1 && numof1!=-1)
			{
				max=numof1;
				row=i;
			}
		}
		if(row==-1)
		{
			System.out.println("No row is there");
		}
		else
		{
			System.out.println("Row with Max 1 is: "+row);
		}
	}
	
	public static int first(int mat[],int l,int h)
	{
		while(l<=h)
		{
			int mid=l+((h-l)/2);
			if((mid==0 || mat[mid-1]==0) && mat[mid]==1)
			{
				return mid;
			}
			else if(mat[mid]==0)
			{
				return first(mat,mid+1,h);
			}
			else
			{
				return first(mat,0,mid-1);
			}
		}
		return -1;
	}
	

	public static void main(String[] args)
	{
		int mat[][]= {	{0,0,0,0},
						{0,0,0,1},
						{0,0,0,0},
						{0,0,0,0}
					};
		int r=mat.length;
		int c=mat[0].length;
		
		
		
		find(mat,r,c);
	}

}
