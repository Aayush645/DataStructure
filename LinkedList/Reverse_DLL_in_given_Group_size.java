package DSA450.LinkedList;

import java.util.*;

import DSA450.LinkedList.Triplet_With_GivenSum_In_DLL.node;

public class Reverse_DLL_in_given_Group_size 
{
	static class node
	{
		int data;
		node next;
		node prev;
		
		node(int data)
		{
			this.data=data;
			next=null;
			prev=null;
		}
	}
	static node head=null,tail=null;
	public static void addNode(int data)
	{
		node temp=new node(data);
		if(head==null)
		{
			head=temp;
			tail=temp;
			return;
		}
		node ptr=head;
		while(ptr.next!=null)
		{
			ptr=ptr.next;
		}
		ptr.next=temp;
		temp.prev=ptr;
		tail=temp;
	}
	
	public static void reverse(int k)
	{
		Stack<node> s=new Stack<>();
		node temp=head;
		int count;
		node ptr=null;
		
		while(temp!=null)
		{
			count=0;
			while(temp!=null && count<k)
			{
				s.push(temp);
				count++;
				temp=temp.next;
			}
			
			while(!s.empty())
			{
				if(ptr==null)
				{
					ptr=s.peek();
					head=ptr;
					head.prev=null;
					tail=ptr;
					s.pop();
				}
				else
				{
					ptr.next=s.peek();
					s.peek().prev=ptr;
					ptr=ptr.next;
					tail=ptr;
					s.pop();
					
				}
			}
			ptr.next=null;
		}
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
	public static void printBack()
	{
		node temp=tail;
		
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.prev;
		}
	}
	
	
	public static void main(String[] args) 
	{
		addNode(1);
		addNode(2);
		addNode(4);
		addNode(5);
		addNode(6);
		addNode(8);
		addNode(9);
		
		int k=2;
		
		System.out.println("Before Reversing: ");
		print();
		reverse(k);
		System.out.println("\nAfter reversing: ");
		print();
		
		System.out.println("\nAfter reversing (printing from end to head): ");
		printBack();

	}

}
