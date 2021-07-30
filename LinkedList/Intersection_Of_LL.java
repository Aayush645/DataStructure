package DSA450.LinkedList;

public class Intersection_Of_LL 
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

	public static void print(node head)
	{
		node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	
	public static void intersection(node head1,node head2)
	{
		node temp1=head1,temp2=head2;
		
		while(temp1!=null && temp2!=null)
		{
			//System.out.println("hi");
			if(temp1.data==temp2.data)
			{
				System.out.print(temp1.data+" ");
				temp1=temp1.next;
				temp2=temp2.next;
			}
			else if(temp1.data<temp2.data)
			{
				temp1=temp1.next;
			}
			else
			{
				temp2=temp2.next;
			}
		}
	}
	
	public static void main(String[] args)
	{
			node head1=null,head2=null;
		    head1= add(head1,1);
	        head1.next = add(head1,2);
	        head1.next.next = add(head1,3);
	        head1.next.next.next = add(head1,4);
	        head1.next.next.next.next = add(head1,6);
	 
	        // creating second linked list
	        head2 = add(head2,2);
	        head2.next = add(head2,4);
	        head2.next.next = add(head2,6);
	        head2.next.next.next = add(head2,8);
	        
//	        print(head1);
//	        System.out.println();
//	        print(head2);
	        System.out.println("Intersection of two list are: ");
	        intersection(head1,head2);

	}

}
