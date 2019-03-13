    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

//    public static int maxDepth(TreeNode root) {
//        if (root == null) {
//            return 0;
//        }
//        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
//    }
    
    public static int maxDepth(TreeNode root){
        if(root==null)
            return 0;
         // APPLYING BFS, USIING QUEUES. 
         Queue<TreeNode> queue = new LinkedList<>();
         queue.add(root);
         int depth=0;
         while(!queue.isEmpty()){
             int size = queue.size();
             while(size>0){
                 TreeNode current = queue.poll(); //remove
                 if(current.left!=null)
                     queue.add(current.left);
                 if(current.right!=null)
                     queue.add(current.right);
                 size--;
             }
             depth++;
         }
         return depth;
    }
