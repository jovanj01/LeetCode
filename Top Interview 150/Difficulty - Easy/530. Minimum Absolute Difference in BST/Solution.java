class Solution{
    public static void main(String[] args){
        TreeNode one = new TreeNode(1, null, null);
        TreeNode three = new TreeNode(3, null, null);
        TreeNode two = new TreeNode(2, one, three);

        TreeNode six = new TreeNode(6, null, null);
        TreeNode root = new TreeNode(4, two, six);

        int res = getMinimumDifference(root);

        System.out.println("Rez je: " + res);
    }


    //MORA ici levi pa desni jer je tako increasing order za BST, u sustini porede se 2 jedan poored drugog
    static int min = Integer.MAX_VALUE;
    static Integer prev = null;

    public static int getMinimumDifference(TreeNode root){
        if (root == null) return min;
        
        getMinimumDifference(root.left);
        
        if (prev != null) min = Math.min(min, root.val - prev);
        prev = root.val;
        
        getMinimumDifference(root.right);

        return min;
    }
}

class TreeNode {
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