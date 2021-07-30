package DSA450.LinkedList;

import DSA450.LinkedList.Triplet_With_GivenSum_In_DLL.node;

public class Rotate_DLL_by_given_number 
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

	public static void print()
	{
		node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	
	public static void rotatebyK(int k)
	{
		node end=head;
		
		for(int i=1;i<k;i++)
		{
			end=end.next;
		}
		node newHead=end.next;
		node temp=end.next;
		
		while(temp.next!=null)
		{
			temp=temp.next;     // temp will reach to last node
		}
		
		temp.next=head;
		head.prev=temp;
		newHead.prev=null;
		end.next=null;
		head=newHead;
		
		
	}
	
	public static void main(String[] args) 
	{
		addNode(1);
		addNode(2);
		addNode(3);
		addNode(4);
		addNode(5);
		System.out.println("Before rotating: ");
		print();
		
		int k=1;
		rotatebyK(k);
		
		System.out.println("\nAfter Rotating: ");
		print();

	}

}
