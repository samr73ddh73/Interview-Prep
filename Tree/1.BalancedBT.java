//https://leetcode.com/problems/balance-a-binary-search-tree/
class Solution {
    public void inorder(TreeNode root, ArrayList<Integer> l)
    {
        if(root==null)
            return;
        inorder(root.left,l);
        l.add(root.val);
        inorder(root.right,l);
    }
    public TreeNode constructTree(ArrayList<Integer> list,int l,int r)
    {
       if(l<=r)
       {
           int mid=l+(r-l)/2;
           TreeNode root=new TreeNode(list.get(mid));
           root.left=constructTree(list,l,mid-1);
           root.right=constructTree(list,mid+1,r);
           return root;
       }
        return null;
    }
    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer> l=new ArrayList<>();
        inorder(root,l);
        //System.out.print("preorder "+l);
        //TreeNode root1=new TreeNode(l.get(0));
        return constructTree(l,0,l.size()-1);
        //return root1;
        
    }
}