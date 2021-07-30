package DSA450.String;

public class Print_All_Subsequences 
{
	
	public static void print(String s,int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				System.out.print(s.substring(i,j+1)+" ");
			}
		}
		
	}
	

	public static void main(String[] args) 
	{
		String s="abc";
		int n=s.length();
		
		print(s,n);

	}

}
