package DSA450.LinkedList;

public class Add_Two_LL 
{	 
    static class Node {
 
        int data;
        Node next;
 
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    
    static Node head1, head2;
    
    public static void printList(Node head)
    {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println("");
    }

    
    public static Node addTwoList(Node head1,Node head2)
    {
    	int carry=0,sum;
    	Node res=null;
    	Node temp=null;
    	Node prev=null;
    	
    	while(head1!=null || head2!=null)
    	{
    		sum=carry+((head1!=null)?head1.data:0)+((head2!=null)?head2.data:0);
    		carry=(sum>=10)?1:0;
     		sum=sum%10;
    		
    		temp=new Node(sum);
    		
    		if(res==null)
    		{
    			res=temp;
    		}
    		else
    		{
    			prev.next=temp;
    		}
    		
    		prev=temp;
    		
    		 if (head1 != null) {
                 head1=head1.next;
             }
             if (head2 != null) {
                 head2=head2.next;
             }
    	}
    	
    	if (carry > 0) {
            temp.next = new Node(carry);
        }
    	
    	return res;
    }
    
    
	public static void main(String[] args) 
	{
		head1 = new Node(7);
        head1.next = new Node(5);
        head1.next.next = new Node(9);
        head1.next.next.next = new Node(4);
        head1.next.next.next.next = new Node(6);
        System.out.print("First List is ");
        printList(head1);
 
        // creating second list
        head2 = new Node(8);
        head2.next = new Node(4);
        System.out.print("Second List is ");
        printList(head2);
        
        Node head3=addTwoList(head1,head2);
        printList(head3);
        

	}

}
