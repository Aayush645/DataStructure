package DSA450.LinkedList;
public class Add_1_to_LL
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
	
	public static node reverse(node head)
	{
		node prev=null;
		node current=head;
		node next=null;
		
		while(current!=null)
		{
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
			
		}
		return prev;
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
	
	public static node add1(node head)
	{
		int carry=1;
		node res=head,prev=null,temp=null;
		int sum;
		while(head!=null)
		{
			sum=carry+head.data;
			carry=(sum>=10)?1:0;
			sum=sum%10;
			
			head.data=sum;
			temp=head;
			head=head.next;
		}
		if(carry>0)
		{
			temp.next=add(head,carry);
		}
		return res;
	}
	
	
	public static void main(String[] args) 
	{
		node head=null;
		//head=add(head,1);
		head=add(head,9);
		head=add(head,9);
		head=add(head,9);
		
		head=reverse(head);
		System.out.println("After reversing: ");
		print(head);
		
		System.out.println("\nAfter Adding 1 to LL: ");
		node head1=add1(head);
		
		//reverse(head1);
		print(head1);

	}

}
