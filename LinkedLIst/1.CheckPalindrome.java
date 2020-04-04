import java.util.*;
public class linkedlist
{
    static node head;
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


    public static String checkPalindrome(node head,String str)
    {
        node temp=head;
        int len=0;
        Stack<Character> st=new Stack<>();
        while(temp!=null)
        {
            st.push(temp.data);
            temp=temp.next;
            len++;
        }
        temp=head;
        while(temp!=null)
        {
            if(temp.data!=st.pop())
                return "False";
            
            temp=temp.next;
            len++;
        }
        return "True";
        
        
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
     System.out.println(checkPalindrome(head,str));
    }
}