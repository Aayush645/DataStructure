package DSA450.String;

public class Min_No_Of_Flips
{
	public static char nextExpected(char expected)
	{
		if(expected=='1')
		{
			return '0';
		}
		else
		{
			return '1';
		}
	}
	
	public static int minFlips(String s,char expected)
	{
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=expected)
			{
				count++;
			}
			
			expected=nextExpected(expected);
		}
		return count;
	}
	
	public static int minFlipToMakeStringAlternate(String str)
	{
		return Math.min(minFlips(str,'0'), minFlips(str,'1'));
		
	}

	public static void main(String[] args) 
	{
		String str = "0001010111";
        System.out.println(minFlipToMakeStringAlternate(str));
	}

}
