class Solution{
    public static void main(String[] args){
        TreeNode root = new TreeNode(3);
        TreeNode firstLeft = new TreeNode(9, null, null);
        TreeNode firstRight = new TreeNode(20);
        root.left = firstLeft;
        root.right = firstRight;
        TreeNode secondLeft =  new TreeNode(15, null, null);
        TreeNode secondRight =  new TreeNode(7, null, null);
        firstRight.left = secondLeft;
        firstRight.right = secondRight;
        
        int res = maxDepth(root);

        System.out.println("Ovo je rez depth: " + res);

    }

    public static int maxDepth(TreeNode root){
        //prepare to learn arabic buddy, ovo moras nauciti samo kako funkcionise algoritam

        if(root == null) {
            return 0;
        }

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        return Math.max(left, right) +1; //+ 1 ide sa root
    }
}

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(){}

    TreeNode(int val){
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
    
}