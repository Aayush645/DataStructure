package DSA450.String;

public class Palindrome 
{
	
	public static boolean isPalindrome(String a,int n)
	{
		int l=0,r=n-1;
		
		while(l<r)
		{
			if(a.charAt(l)!=a.charAt(r))
			{
				return false;
			}
			l++;
			r--;
		}
		return true;
	}

	public static void main(String[] args) 
	{
		String a="abbaa";
		int n=a.length();
		
		System.out.println(isPalindrome(a,n));

	}

}
