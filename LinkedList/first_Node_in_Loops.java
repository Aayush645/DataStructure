package DSA450.LinkedList;

import DSA450.LinkedList.Remove_Loop_inLL.node;

public class first_Node_in_Loops
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
				break;
			}
		}
		
		if(s_ptr==f_ptr)
		{
			s_ptr=head;
			
			while(s_ptr!=f_ptr)
			{
				s_ptr=s_ptr.next;
				f_ptr=f_ptr.next;
			}
			System.out.println("Starting node: "+s_ptr.data);
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
	}

}
