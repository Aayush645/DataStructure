package DSA450.LinkedList;

import DSA450.LinkedList.Segregate_Even_Odd_Nodes.node;

public class Nnode_from_last_of_LL 
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
	
	public static void find(int n)
	{
		node temp=head;
		int count=0;
		while(temp!=null)
		{
			count++;
			temp=temp.next;
		}
		
		temp=head;
		
		for(int i=0;i<(count-n);i++)
		{
			temp=temp.next;
		}
		
		System.out.println("Required Node is: "+temp.data);
	}
	
	public static void main(String[] args)
	{
		add(17);
		add(15);
		add(8);
		add(12);
		add(10);
		add(5);
		add(4);
		
		int n=3;
		
		find(n);

	}

}
