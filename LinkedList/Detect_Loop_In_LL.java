package DSA450.LinkedList;

import java.util.*;

public class Detect_Loop_In_LL 
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
	
	public static node add(node head,int data)
	{
		node temp=new node(data);
		
		if(head==null)
		{
			head=temp;
			return head;
		}
		node ptr=head;
		while(ptr.next!=null)
		{
			ptr=ptr.next;
		}
		ptr.next=temp;
		return head;
	}

	public static void detectLoop(node head)  // Using O(n) Time and O(n) Space Complexity
	{
		Set<Integer> s=new HashSet<>();
		node temp=head;
		
		while(temp!=null)
		{
			if(!s.contains(temp.data))
			{
				s.add(temp.data);
			}
			else
			{
				System.out.println("Loop is there");
				return;
			}
			temp=temp.next;
		}
		
		System.out.println("LOOp is not there");
	}
	
	public static void floydCycle(node head)  // O(n) Time and O(1) space complexity
	{
		node s_ptr=head;
		node f_ptr=head;
		
		while(f_ptr!=null && f_ptr.next!=null)
		{
			s_ptr=s_ptr.next;
			f_ptr=f_ptr.next.next;
			
			if(s_ptr==f_ptr)
			{
				System.out.println("Loop is found");
				return;
			}
		}
		System.out.println("Not found");
	}
	
	
	public static void main(String[] args)
	{
		node head=null;
		head=add(head,1);
		head=add(head,2);
		head=add(head,3);
		head=add(head,4);
		head=add(head,5);
		head=add(head,6);
		head.next.next.next.next.next.next=head.next;
	
		//detectLoop(head);  // Using O(n) Time and Space Complexity
		
		floydCycle(head);  // O(n) Time and O(1) space complexity
		
		

	}

}
