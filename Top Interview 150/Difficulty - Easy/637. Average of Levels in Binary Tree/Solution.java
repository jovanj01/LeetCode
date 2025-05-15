import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    public static void main(String[] args) {
        TreeNode sevenNode = new TreeNode(7, null, null);
        TreeNode fifteenNode = new TreeNode(15, null, null);
        TreeNode twentyNode = new TreeNode(20, fifteenNode, sevenNode);

        TreeNode nineNode = new TreeNode(9, null, null);
        TreeNode root = new TreeNode(3, nineNode, twentyNode);

        List<Double> resList = averageOfLevels(root);

        System.out.println(resList);
    }

    public static  List<Double> averageOfLevels(TreeNode root){
        List<Double> averages = new ArrayList<>();
        if(root == null) return null;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        double levelSum = 0;

        while (!queue.isEmpty()){
            levelSum = 0;

            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode currentNode = queue.poll();
                levelSum += currentNode.val;
                if(currentNode.left != null) queue.offer(currentNode.left);
                if(currentNode.right != null) queue.offer(currentNode.right);
            }

            averages.add(levelSum/size);
        }

        return averages;
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