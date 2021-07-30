package DSA450.String;
import java.util.*;
public class Remove_Consecutive_Characters {

	static void removeDuplicates(char[] S)
    {
        int n=S.length;
        if (n<2)
        {
           return;
        }

        int j=0;
 
        for (int i = 1; i < n; i++)
        {
            if (S[j] != S[i])
            {
                j++;
                S[j] = S[i];
            }
        }
        System.out.println(Arrays.copyOfRange(S, 0, j + 1));
    }
 
    // Driver code
    public static void main(String[] args)
    {
        char S1[] = "geeksforgeeks".toCharArray();
        removeDuplicates(S1);
 
        char S2[] = "aabcca".toCharArray();
        removeDuplicates(S2);
    }

}
