package DSA450.String;

public class Common_Prefix 
{
	
	public static int findMinLength(String arr[], int n)
    {
        int min = arr[0].length();
 
        for (int i = 1; i < n; i++)
        {
            if (arr[i].length() < min)
            {
                min = arr[i].length();
            }
        }
 
        return (min);
    }

    public static String commonPrefix(String arr[], int n)
    {
        int minlen = findMinLength(arr, n);
 
        String result = ""; // Our resultant string
        char current; // The current character
 
        for (int i = 0; i < minlen; i++)
        {
            current = arr[0].charAt(i);
 
            for (int j = 1; j < n; j++)
            {
                if (arr[j].charAt(i) != current)
                {
                    return result;
                }
            }
 
            result += (current);
        }
 
        return (result);
    }

	public static void main(String[] args)
	{
		String arr[] = {"geeksforgeeks", "geeks",
	            "geek", "geezer"};
	        int n = arr.length;
	 
	        String ans = commonPrefix(arr, n);
	 
	        if (ans.length() > 0) 
	        {
	            System.out.println("The longest common prefix is: "
	                    + ans);
	        } 
	        else 
	        {
	            System.out.println("There is no common prefix");
	        }
	    }


}
