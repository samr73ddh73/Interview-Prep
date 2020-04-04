import java.util.*;
public class 2.CountLeafNodes {

    public int leaf(Node node)
    {
        if(node.left==null && node.right==null)
            return 1;
        return leaf(node.left)+leaf(node.right);
    }

}