//https://practice.geeksforgeeks.org/problems/check-for-balanced-tree/1
import java.util.*;
public class 4.CheckForBalanceTree {

    int check(Node root)
    {
        if(root==null)
            return 0;
        int l=check(root.left);
        int r=check(root.right);
        if(Math.abs(l-r)>1 || l==-1 || r==-1)
            return -1;
        return Math.max(l,r)+1;
    }
    boolean isBalanced(Node root)
    {
        if(check(root)==-1)
            return false;
        return true;
    }
}