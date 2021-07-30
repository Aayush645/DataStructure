package DSA450.String;

public class Min_Char_ToADD_Make_Palindrome 
{
	public static boolean isPalindrome(String s)
	{
		int i=0,j=s.length()-1;
		while(i<j)
		{
			if(s.charAt(i)!=s.charAt(j))
			{
				return false;
			}
			i++;j--;
		}
		return true;
	}
	
	public static void charToAdd(String s)
	{
		int ans=0;
		if(s.length()==0 || s.length()==1)
		{
			System.out.println("Zero addition required");
			return;
		}
		while(s.length()>0)
		{
			if(isPalindrome(s))
			{
				break;
			}
			else
			{
				ans+=1;
				s=s.substring(0,s.length()-1);
			}
		}
		System.out.println("Number of characters to add: "+ans);
	}

	public static void main(String[] args) 
	{
		
		String s="BABABAA";
		charToAdd(s);

	}

}
