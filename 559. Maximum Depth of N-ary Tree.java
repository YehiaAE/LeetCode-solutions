/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    public int maxDepth(Node root) {
        int cnt=0;
        if(root == null)
            return 0;
        if(root.children.size()==0)
            return 1;
        for(Node x : root.children){
            cnt = Math.max(cnt,1+maxDepth(x));
        }
        return cnt;
    }
}
