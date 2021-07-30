package DSA450.Matrix;

public class Spinal_Traversal_of_matrix 
{
	public static void spinal(int arr[][],int r,int c)
	{
		if(r==0)
		{
			System.out.println("Phele matrix to bana");
		}
		
		int i=0,j=0,n=c-1,m=r-1;
		
		while(i<=m && j<=n)
		{
			for(int k=j;k<=n;k++)
			{
				System.out.print(arr[i][k]+" ");
			}
			i++;
			for(int k=i;k<=m;k++)
			{
				System.out.print(arr[k][n]+" ");
			}
			n--;
			for(int k=n;k>=j;k--)
			{
				System.out.print(arr[m][k]+" ");
			}
			m--;
			for(int k=m;k>=i;k--)
			{
				System.out.print(arr[k][j]+" ");
			}
			j++;
		}
	}

	public static void main(String[] args) 
	{
		int matrix[][] = {	{1, 2, 3, 4},
		           			{5, 6, 7, 8},
		           			{9, 10, 11, 12},
		           			{13, 14, 15,16}	};
		
		int r=matrix.length;
		int c=matrix[0].length;
		spinal(matrix,r,c);

	}

}
