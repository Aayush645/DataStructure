package DSA450.Arrays;
import java.util.*;
public class unionOfTwoUnsortedArray {

	public static void main(String[] args) 
	{
		int a[] = { 1, 2, 5, 6, 2, 3, 5, 7, 3 };
	    int b[] = { 2, 4, 5, 6, 8, 9, 4, 6, 5, 4 };
	    
	    int n=a.length;
	    int m=b.length;
	    
	    Set<Integer> hs=new HashSet<>();
	    
	    for(int i=0;i<n;i++)
	    {
	    	hs.add(a[i]);
	    }
	    
	    for(int j=0;j<m;j++)
	    {
	    	hs.add(b[j]);
	    }
	    
	    System.out.println(hs);
	}

}
