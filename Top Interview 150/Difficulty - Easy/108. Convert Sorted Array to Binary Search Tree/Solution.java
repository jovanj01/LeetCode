class Solution {
    public static void main(String[] args){
        int[] nums = {-10, -3, 0, 5, 9};
        TreeNode resNode = sortedArrayToBST(nums);
        
        System.out.println("rez: " + resNode.val + resNode.left.val);

    }

    // TreeNode parentNode = new TreeNode();

    public static TreeNode sortedArrayToBST(int[] nums){
        if(nums.length == 0) return null;
        return constructNodeFromArray(nums, 0, nums.length-1);
    }

    public static TreeNode constructNodeFromArray(int nums[], int left, int right){
        if (left > right) return null;
        int middlePoint = left + (right - left)/2;

        TreeNode root = new TreeNode(nums[middlePoint]);
        root.left = constructNodeFromArray(nums, left, middlePoint - 1);
        root.right = constructNodeFromArray(nums, middlePoint + 1, right);

        return root;
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