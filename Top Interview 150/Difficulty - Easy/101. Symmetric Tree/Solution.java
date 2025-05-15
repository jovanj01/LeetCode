class Solution {
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        TreeNode firstLeft = new TreeNode(2);
        TreeNode firstRight = new TreeNode(2);
        root.left = firstLeft;
        root.right = firstRight;

        TreeNode firstLeftL = new TreeNode(3);
        TreeNode firstLeftR = new TreeNode(4);

        firstLeft.left = firstLeftL;
        firstLeft.right = firstLeftR;

        TreeNode firstRightL = new TreeNode(4);
        TreeNode firstRightR = new TreeNode(3);

        firstRight.left = firstRightL;
        firstRight.right = firstRightR;

        boolean res = isSymmetric(root);

        System.out.println("Rezultat je: " + res);
    }

    public static boolean isSymmetric(TreeNode root) {
        return isSymRecursion(root.left, root.right);
    }

    public static boolean isSymRecursion(TreeNode leftNode, TreeNode rightNode){
        boolean left = true;
        boolean right = true;
        if((leftNode == null && rightNode != null) || (leftNode != null && rightNode == null)){
            return false;
        }else if (leftNode == null && rightNode == null) {
            return true;
        }else if(leftNode != null && rightNode != null && leftNode.val != rightNode.val){
            return false;
        }else if (leftNode != null && rightNode != null && leftNode.val == rightNode.val) {
            left = isSymRecursion(leftNode.left, rightNode.right);
            right = isSymRecursion(leftNode.right, rightNode.left);
        }

        return left && right;
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