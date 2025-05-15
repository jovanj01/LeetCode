class Solution {
    public static void main(String[] args){
        TreeNode root = new TreeNode(4);
        TreeNode firstLeft = new TreeNode(2);
        TreeNode firstRight = new TreeNode(7);
        root.left = firstLeft;
        root.right = firstRight;

        TreeNode firstLeftL = new TreeNode(1);
        TreeNode firstLeftR = new TreeNode(3);
        firstLeft.left = firstLeftL;
        firstLeft.right = firstLeftR;

        TreeNode firstRightL = new TreeNode(6);
        TreeNode firstRightR = new TreeNode(9);
        firstRight.left = firstRightL;
        firstRight.right = firstRightR;

        TreeNode res = invertTree(root);

        System.out.println(res.left.left.val);
    }

    public static TreeNode invertTree(TreeNode root){
        TreeNode temp = root;
        TreeNode tmp;

        if(temp != null){
            tmp = temp.left;
            temp.left = temp.right;
            temp.right = tmp;
            invertTree(temp.left);
            invertTree(temp.right);
        }

        return temp;
    }
}

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(){}

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
    
}