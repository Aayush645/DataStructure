package DSA450.LinkedList;
import java.util.*;
//import DSA450.LinkedList.Remove_Duplicates_In_Sorted_LL.node;

public class Remove_Duplicates_In_UnsortedLL 
{
	static class node
	{
		int data;
		node next;
		
		node(int data)
		{
			this.data=data;
			next=null;
		}
	}
	
	static node head=null;
	
	public static void add(int data)
	{
		node temp=new node(data);
		if(head==null)
		{
			head=temp;
			return;
		}
		node ptr=head;
		while(ptr.next!=null)
		{
			ptr=ptr.next;
		}
		ptr.next=temp;
	}

	public static void print()
	{
		node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	
	
	public static void remove()   // Using Hashing
	{
		Set<Integer> s=new HashSet<>();
		node current=head;
		node prev=null;
		
		while(current!=null)
		{
			if(!s.contains(current.data))
			{
				s.add(current.data);
				prev=current;
				current=current.next;
			}
			else
			{
				prev.next=current.next;
				current=current.next;
			}
		}
	}
	

	public static void main(String[] args) 
	{
		add(12);
		add(11);
		add(12);
		add(21);
		add(41);
		add(43);
		add(21);
		
		System.out.println("Before removing Duplicates: ");
		print();
		
		remove();
		
		System.out.println("\nAfter removing Duplicates: ");
		print();


	}

}
