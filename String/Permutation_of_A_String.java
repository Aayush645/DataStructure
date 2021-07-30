package DSA450.String;

public class Permutation_of_A_String 
{
	
	public static void permutation(String s,int l,int r)
	{
		if(l==r)
		{
			System.out.print(s+" ");
		}
		
		else
		{
			for(int i=l;i<=r;i++)
			{
				s=swap(s,l,i);
				permutation(s,l+1,r);
				s=swap(s,l,i);
			}
		}
	}
	
	public static String swap(String s,int l,int r)
	{
		char temp;
		char c[]=s.toCharArray();
		temp=c[l];
		c[l]=c[r];
		c[r]=temp;
		return String.valueOf(c);
	}

	public static void main(String[] args) 
	{
		String s="abc";
		int n=s.length();
		
		permutation(s,0,n-1);

	}

}
