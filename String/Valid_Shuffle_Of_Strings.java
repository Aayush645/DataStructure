package DSA450.String;

public class Valid_Shuffle_Of_Strings 
{
	public static boolean isInterleaved(String a,String b,String c)
	{
		int i=0,j=0,k=0;
		int n=c.length();
		while(k<n)
		{
			if(i<a.length() &&(c.charAt(k)==a.charAt(i)))
			{
				i++;
			}
			else if(j<b.length() && (c.charAt(k)==b.charAt(j)))
			{
				j++;
			}
			else
			{
				return false;
			}
			k++;
		}
		return true;
	}

	public static void main(String[] args) 
	{
		String A = "AB";
        String B = "CD";
        String C = "ACBD";        
        if (isInterleaved(A, B, C) == true)
            System.out.printf("%s is interleaved of %s and %s", C, A, B);
        else
            System.out.printf("%s is not interleaved of %s and %s", C, A, B);

	}

}
