package DSA450.Arrays;

public class commonElementsIn3Array {

	public static void main(String[] args) 
	{
		int A[] = {1, 5, 10, 20, 40, 80, 80};
		int B[] = {6, 7, 20, 80, 80};
		int C[] = {3, 4, 15, 20, 30, 70, 80, 80};
		
		int n=A.length;
		int m=B.length;
		int o=C.length;
		int i=0,j=0,k=0;
		
		int prev1,prev2,prev3;
		
		prev1=prev2=prev3=Integer.MIN_VALUE;
		
		while(i<n && j<m && k<o)
		{
			while(A[i]==prev1 && i<n)
			{
				i++;
			}
			
			while(B[j]==prev2 && j<m)
			{
				j++;
			}
			
			while(C[k]==prev3 && k<o)
			{
				k++;
			}
			
			
			if(A[i]==B[j] && B[j]==C[k])
			{
				System.out.print(A[i]+" ");
				prev1=prev2=prev3=A[i];
				i++;
				j++;
				k++;
			}
			
			if(A[i]<B[j])
			{
				i++;
			}
			
			else if(B[j]<C[k])
			{
				j++;
			}
			
			else
				k++;
			
		}

	}

}
