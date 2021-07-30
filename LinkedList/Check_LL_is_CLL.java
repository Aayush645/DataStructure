package DSA450.LinkedList;

public class Check_LL_is_CLL 
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
	
	public static void isCircular(node head)
	{
		node temp=head;
		temp=head.next;
		
		while(temp!=null && temp!=head)
		{
			temp=temp.next;
		}
		
		if(temp==head)
		{
			System.out.println("It is Circular");
		}
		else
		{
			System.out.println("Not Circular");
		}
	}
	
	public static void main(String[] args) 
	{
		node head1=null;
		head1= add(head1,3);
        head1.next = add(head1,6);
        head1.next.next = add(head1,9);
        head1.next.next.next = add(head1,15);
        head1.next.next.next.next = add(head1,30);
        
        head1.next.next.next.next.next=head1;
        isCircular(head1);

	}

}
