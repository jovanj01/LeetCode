class Solution{
    public static void main(String[] args){
        TreeNode node7 = new TreeNode(7);
        TreeNode node2 = new TreeNode(2);
        TreeNode node11 = new TreeNode(11, node7, node2);

        TreeNode node4_left = new TreeNode(4, node11, null);

        TreeNode node13 = new TreeNode(13);
        TreeNode node1 = new TreeNode(1);
        TreeNode node4_right = new TreeNode(4, null, node1);

        TreeNode node8 = new TreeNode(8, node13, node4_right);

        TreeNode root = new TreeNode(5, node4_left, node8);

        int targetSum = 22;

        boolean res = hasPathSum(root, targetSum);

        System.out.println("Rezultat je: " + res);
    }


    public static boolean hasPathSum(TreeNode root, int targetSum){
        boolean left = false;
        boolean right = false;
        
        if(root == null){
            return false;
        }

        if(root.left != null && root.right != null){
            root.left.val += root.val;
            root.right.val += root.val;
            
            left = hasPathSum(root.left, targetSum);
            right = hasPathSum(root.right, targetSum);
        }else if (root.left != null) {
            root.left.val += root.val;
            left = hasPathSum(root.left, targetSum);
        }else if (root.right != null) {
            root.right.val += root.val;
            right = hasPathSum(root.right, targetSum);
        }

        if(root.val == targetSum && root.left == null && root.right == null){
            return true;
        }

        return left || right;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}
    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}