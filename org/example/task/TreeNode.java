package org.example.task;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class TreeNode {
    int val;
    List<TreeNode> children;
    TreeNode(int val) {
        this.val = val;
        children = new ArrayList<>();
    }
    void addChild(TreeNode child) {
        children.add(child);
    }
}

 class TreeExample {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);

        TreeNode child1 = new TreeNode(2);
        TreeNode child2 = new TreeNode(3);
        root.addChild(child1);
        root.addChild(child2);

        TreeNode child3 = new TreeNode(4);
        TreeNode child4 = new TreeNode(5);
        TreeNode child5 = new TreeNode(6);
        TreeNode child6 = new TreeNode(7);
        TreeNode child7 = new TreeNode(8);
        child1.addChild(child3);
        child1.addChild(child4);
        child2.addChild(child5);
        child3.addChild(child6);
        child3.addChild(child7);

        makeArray();


        printTree(root, 0);
    }

     private static void makeArray() {

     }

     // Рекурсивный метод для вывода структуры дерева
    public static void printTree(TreeNode node, int depth) {
        System.out.println("  ".repeat(Math.max(0, depth)) + node.val);
        for (TreeNode child : node.children) {
            printTree(child, depth + 1);
        }
    }
}


