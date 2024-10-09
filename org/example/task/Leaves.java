package org.example.task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leaves {
    static class TreeNodeN {
        int value;
        TreeNodeN left;
        TreeNodeN right;

        TreeNodeN(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }

    public static class BinaryTree {
        TreeNodeN root;

        BinaryTree() {
            root = null;
        }

        public void add(int value) {
            root = addRecursive(root, value);
        }

        private TreeNodeN addRecursive(TreeNodeN current, int value) {
            if (current == null) {
                return new TreeNodeN(value);
            }

            if (value < current.value) {
                current.left = addRecursive(current.left, value);
            } else if (value > current.value) {
                current.right = addRecursive(current.right, value);
            }

            return current;
        }

        public int[] getLeaves() {
            List<Integer> leavesList = new ArrayList<>();
            findLeaves(root, leavesList);
            // Преобразуем List в массив
            return leavesList.stream().mapToInt(i -> i).toArray();
        }

        private void findLeaves(TreeNodeN node, List<Integer> leavesList) {
            if (node == null) {
                return;
            }

            if (node.left == null && node.right == null) {
                leavesList.add(node.value);
            } else {
                if (node.left != null) {
                    findLeaves(node.left, leavesList);
                }
                if (node.right != null) {
                    findLeaves(node.right, leavesList);
                }
            }
        }

        public static void main(String[] args) {

            BinaryTree tree = new BinaryTree();
            tree.add(10);
            tree.add(5);
            tree.add(15);
            tree.add(3);
            tree.add(7);
            tree.add(12);

            int[] leaves = tree.getLeaves();
            System.out.println("Leaves: " + Arrays.toString(leaves));
        }
    }
}
