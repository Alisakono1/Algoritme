package org.example.task;

public final class TwoNode {
    int val;
    TwoNode left;
    TwoNode right;

    public TwoNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }


     public static class BinaryTreeExample {

         public static TwoNode TwoNode;
         public static int depth;


         public BinaryTreeExample() {
         }

         public static void main(String[] args) {
            // Создаем корень дерева
            TwoNode root = new TwoNode(1);

            // Создаем левого и правого потомков для корня
            root.left = new TwoNode(2);
            root.right = new TwoNode(3);

            // Создаем левых и правых потомков для левого потомка корня
            root.left.left = new TwoNode(4);
            root.left.right = new TwoNode(5);

            root.right.left = new TwoNode(6);
            root.right.right = new TwoNode(7);

            // Выводим структуру дерева
            printTree(root, 0);
        }

         // Рекурсивный метод для вывода структуры дерева
        public static void printTree(TwoNode node, int depth) {
            BinaryTreeExample.TwoNode = node;
            BinaryTreeExample.depth = depth;
            while (true) {
                System.out.println("  ".repeat(Math.max(0, depth)) + node.val);
                if (node.left != null) {
                    printTree(node.left, depth + 1);
                }
                if (node.right != null) {
                    depth = depth + 1;
                    node = node.right;
                    continue;
                }
                return;
            }
        }
     }
}


