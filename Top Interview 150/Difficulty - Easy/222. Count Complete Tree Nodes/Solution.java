class Solution {
    public static void main(String[] args) {
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);

        // Unutrašnji čvorovi
        TreeNode node2 = new TreeNode(2, node4, node5);
        TreeNode node3 = new TreeNode(3, node6, null);

        // Koren stabla
        TreeNode root = new TreeNode(1, node2, node3);

        int result = countNodes(root);

        System.out.println("Rezultat je: " + result);
    }

    public static int countNodes(TreeNode root){
        int left = 0;
        int right = 0;
        
        if(root == null){
            return 0;
        }
        if(root.left != null){
            left = countNodes(root.left);
            if(root.right != null){
                right = countNodes(root.right);
            }
        }
        
        return left+right+1;
    }
}

class TreeNode{
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