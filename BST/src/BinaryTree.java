import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree<T extends Comparable<T>> {
    TreeNode<T> root;

    BinaryTree() {
        root = null;
    }

    int size() {
        return sizeRec(root);
    }

    int sizeRec(TreeNode<T> node) {
        if (node == null) {
            return 0;
        } else {
            return (sizeRec(node.left) + 1 + sizeRec(node.right));
        }
    }

    void printLevelOrder() {
        Queue<TreeNode<T>> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode<T> tempNode = queue.poll();
            System.out.print(tempNode.key + " ");

            if (tempNode.left != null) {
                queue.add(tempNode.left);
            }

            if (tempNode.right != null) {
                queue.add(tempNode.right);
            }
        }
    }

    boolean search(T key) {
        return searchRec(root, key);
    }

    boolean searchRec(TreeNode<T> node, T key) {
        if (node == null) {
            return false;
        }
        if (node.key.equals(key)) {
            return true;
        }
        return key.compareTo(node.key) < 0 ? searchRec(node.left, key) : searchRec(node.right, key);
    }
}