package com.practice.trees;

import java.util.*;

public class BinaryTreeLevelOrder102 {

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> ll = new ArrayList<>();

        if (root == null)
            return ll;

        Queue<TreeNode> levelQ = new LinkedList<>();

        levelQ.add(root);
        while (levelQ.size() > 0) {
            Queue<TreeNode> nextLevel = new LinkedList<>();
            Iterator<TreeNode> itr = levelQ.iterator();
            ArrayList<Integer> data = new ArrayList<>();
            while (itr.hasNext()) {
                TreeNode pop = itr.next();
                data.add(pop.val);
                if (pop.left != null)
                    nextLevel.add(pop.left);

                if (pop.right != null)
                    nextLevel.add(pop.right);

            }

            ll.add(data);
            levelQ = nextLevel;
        }

        return ll;
    }
}
