package DSA450.LinkedList;

import DSA450.LinkedList.Check_LL_is_CLL.node;

public class SplitCLL_Into_Two_HalvesCLL {

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
	
	static node head1=null,head2=null;
	public static node add(node head,int data)
	{
		node temp=new node(data);
		if(head==null)
		{
			head=temp;
			return temp;
		}
		
		node ptr=head;
		while(ptr.next!=null)
		{
			ptr=ptr.next;
		}
		ptr.next=temp;
		return temp;
	}
	
	public static void split(node head)
	{
		node slow=head;
		node fast=head;
		
		while(fast.next!=head && fast.next.next!=head)  //we do fast.next.next so that slow pointer will be at mid point
		{
			slow=slow.next;
			fast=fast.next.next;
		}
		
		if(fast.next.next==head)
		{
			fast=fast.next;
		}
		head1=head;
		head2=slow.next;
		slow.next=head1;
		fast.next=head2;
		
	}
	
	public static void print(node head)
	{
		node temp=head;
		do
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		while(temp!=head);
	}
	
	public static void main(String[] args) 
	{
		node head=null;
		head= add(head,3);
        head.next = add(head,6);
        head.next.next = add(head,9);
        head.next.next.next = add(head,15);
        head.next.next.next.next = add(head,30);
        head.next.next.next.next.next=add(head,50);
        
        head.next.next.next.next.next.next=head;  // to make circular
        
        split(head);
        System.out.println("List 1 contains: ");
        print(head1);
        System.out.println("\nList 2 contains: ");
        print(head2);
	}

}
