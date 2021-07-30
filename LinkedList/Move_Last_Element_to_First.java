package DSA450.LinkedList;

import DSA450.LinkedList.Remove_Duplicates_In_UnsortedLL.node;

public class Move_Last_Element_to_First 
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
	
	public static void move()
	{
		node current=head;
		node prev=null;
		
		while(current.next!=null)
		{
			prev=current;
			current=current.next;
		}
		
		current.next=head;
		head=current;
		prev.next=null;
	}
	
	public static void main(String[] args) 
	{
		add(1);
		add(2);
		add(3);
		add(4);
		add(5);
		add(6);
		
		System.out.println("Before Moving: ");
		print();
		
		move();
		
		System.out.println("\nAfter Moving: ");
		print();

	}

}
