package DSA450.Arrays;
import java.util.HashSet;
import java.util.Set;
public class intersectionOfTwoUnsortedArrays {

	public static void main(String[] args) 
	{
		 int a[] = { 1, 3, 2, 3, 4, 5, 5, 6 };
	     int b[] = { 3, 3, 5 };
	 
        
        Set<Integer> s=new HashSet<>();
        
        for(int i=0;i<a.length;i++)
        {
        	s.add(a[i]);
        }
        System.out.println("Intersection of Two Unsorted Arrays: ");
        for(int j=0;j<b.length;j++)
        {
        	if(s.contains(b[j]))
        	{
        		System.out.print(b[j]+" ");
        	}
        }
	}

}
