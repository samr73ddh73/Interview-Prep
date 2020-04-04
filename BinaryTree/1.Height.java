//height of a balanced tree
class Tree
{
    int height(Node node) 
    {
         // Your code here
         if(node==null)
            return 0;
         return Math.max(height(node.left),height(node.right))+1;
    }   
}
