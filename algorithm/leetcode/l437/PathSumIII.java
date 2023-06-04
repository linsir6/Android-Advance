package attention.leetcode.l437;

import java.util.HashMap;
import java.util.Map;

public class PathSumIII {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


    int pathNumber;

    public int pathSumV2(TreeNode root, int sum) {
        if (root == null) return 0;
        sum(root, sum);
        pathSumV2(root.left, sum);
        pathSumV2(root.right, sum);
        return pathNumber;
    }


    public void sum(TreeNode root, long sum) {
        if (root == null) return;
        sum -= root.val;
        if (sum == 0) {
            pathNumber++;
        }
        sum(root.left, sum);
        sum(root.right, sum);
    }


    public int pathSum(TreeNode root, int targetSum) {
        Map<Long, Integer> prefixPath = new HashMap<>();
        prefixPath.put(0L, 1);
        return dfs(root, prefixPath, 0, targetSum);
    }

    public int dfs(TreeNode root, Map<Long, Integer> prefix, long curr, int targetSum) {
        if (root == null) {
            return 0;
        }
        curr = curr + root.val;
        int result = prefix.getOrDefault(curr - targetSum, 0);
        prefix.put(curr, prefix.getOrDefault(curr, 0) + 1);
        result += dfs(root.left, prefix, curr, targetSum);
        result += dfs(root.right, prefix, curr, targetSum);
        prefix.put(curr, prefix.getOrDefault(curr, 0) - 1);
        return result;
    }


    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);

        treeNode3.right = treeNode4;

        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        PathSumIII pathSumIII = new PathSumIII();
        System.out.println(pathSumIII.pathSum(treeNode1, 7));
    }

}
