import java.util.*;
public class linkedlist
{
    static node head;
     static node left;
    public static class node
    {
        char data;
        node next;
        node(char data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public void insertNode(node head,char x)
    {
        node temp=head;
        node n=new node(x);
        if(temp==null)
        {    head=n;
             return;
        }
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=n;
        return;
    }


    public static boolean checkPalindrome(node right)
    {
        // node left=head;
        // if(right==null)
        //     return true;
        // boolean l=checkPalindrome(right.next);
        // if(l==false)
        //     return false;
        // boolean l2=(right.data == (left).data); 
        // left=left.next;
        // return l2;
        left = head; 
  
        /* stop recursion when right becomes NULL */
        if (right == null) 
            return true; 
  
        /* If sub-list is not palindrome then no need to 
           check for current left and right, return false */
        boolean isp = checkPalindrome(right.next); 
        if (isp == false) 
            return false; 
  
        /* Check values at current left and right */
        boolean isp1 = (right.data == (left).data); 
  
        /* Move left to next node */
        left = left.next; 
  
        return isp1;
            
       
        
        
    }
    public static void main(String args[]) {
     Scanner sc=new Scanner(System.in);
     String str=sc.next();
     linkedlist list=new linkedlist();
     
     list.head=new node(str.charAt(0));
     for(int i=1;i<str.length();i++)
     {
        list.insertNode(list.head,str.charAt(i));         
     }
     System.out.println(checkPalindrome(head));
    }
}