package DSA450.LinkedList;

import DSA450.LinkedList.Detect_Loop_In_LL.node;

public class Remove_Loop_inLL
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
	
	public static void floydCycle(node head)  
	{
		node s_ptr=head;
		node f_ptr=head;
		
		while(f_ptr!=null && f_ptr.next!=null)
		{
			s_ptr=s_ptr.next;
			f_ptr=f_ptr.next.next;
			
			if(s_ptr==f_ptr)
			{
				
				System.out.print("Loop detects\n");
				System.out.print("----------------------------Starting process of removing Loop----------------------------");
				break;
			}
		}
		if(s_ptr==f_ptr)
		{
			s_ptr=head;
			if(s_ptr!=f_ptr)
			{
				while(s_ptr.next!=f_ptr.next)
				{
					f_ptr=f_ptr.next;
					s_ptr=s_ptr.next;
				}
				f_ptr.next=null;
			}
			else
			{
				while(f_ptr.next!=s_ptr)
				{
					f_ptr=f_ptr.next;
				}
				f_ptr.next=null;
			}
		}
	}

	public static void print(node head)
	{
		node temp=head;
		
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
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
	
		floydCycle(head);
		System.out.println("\nAfter removing Loop: ");
		print(head);
	
	}

}
