package DSA450.String;
import java.util.*;
public class Count_The_Reversals 
{
	
	public static int countMinReversals(String s)
	{
		int n=s.length();
		if(n%2!=0)
		{
			return -1;
		}
		
		Stack<Character> st=new Stack<>();
		
		for(int i=0;i<n;i++)
		{
			if(s.charAt(i)=='}' && !st.isEmpty())
			{
				if(st.peek()=='{')
				{
					st.pop();
				}
				else
				{
					st.push(s.charAt(i));
				}
			}
			else
			{
				st.push(s.charAt(i));
			}
		}
		
		int size=st.size();
		int c=0;
		while(!st.isEmpty() && st.peek()=='{')
		{
			c++;
			st.pop();
		}
		return(size/2+c%2);
		
	}

	public static void main(String[] args) 
	{

        String expr = "}{{}}{{{";
         
        System.out.println("Number of Reversals: "+countMinReversals(expr));

	}

}
