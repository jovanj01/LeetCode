class Solution{
    public static void main(String[] args){
        TreeNode q = new TreeNode(1);
        TreeNode p = new TreeNode(1);

        TreeNode pLeft = new TreeNode(2);
        TreeNode pRight = new TreeNode(3);

        p.left = pLeft;
        p.right = pRight;

        TreeNode qLeft = new TreeNode(2);
        TreeNode qRight = new TreeNode(3);

        q.left = qLeft;
        q.right = qRight;

        boolean res = isSameTree(p, q);

        System.out.println("Rezultat je: " + res);
    }

    public static boolean isSameTree(TreeNode p, TreeNode q){
        boolean isSame;
        boolean left = true;
        boolean right = true;
        
        if((p == null && q != null) || (p != null && q == null)){
            return false;
        }else if(p == null && q == null){
            return true;
        }else if(p != null && q != null && p.val != q.val){
            return false;
        }else if(p != null && q != null && p.val == q.val) {
            left = isSameTree(p.left, q.left);
            right = isSameTree(p.right, q.right);
        }

        isSame = left && right;

        return isSame;
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
    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
