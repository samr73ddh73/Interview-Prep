import java.util.*;
public class 3.LevelOrderTraversal {
    public void LevelOrderTraversal(Node root)
    {
        Queue<Node> q=new LinkedList<Node>();
        q.push(root);
        while(!q.isEmpty())
        {
            int size=q.size();
            while(size-->0)
            {
                Node x=q.pop();
                System.out.println(x.data+" ");
                if(x.left!=null)
                    q.push(x.left);
                if(x.right!=null)
                    q.push(x.right);
            }
            System.out.println();
        }
    }
}