public class MyBinaryNode<T extends Comparable<T>> {
    INode<T> root;

    MyBinaryNode() {
        root = null;
    }

    void insert(T key) {
        root = insertRec(root, key);
    }

    INode<T> insertRec(INode<T> root, T key) {
        if (root == null) {
            root = new INode<>(key);
            return root;
        }

        if (key.compareTo(root.key) < 0)
            root.left = insertRec(root.left, key);
        else if (key.compareTo(root.key) > 0)
            root.right = insertRec(root.right, key);

        return root;
    }

    void inorder() {
        inorderRec(root);
    }

    void inorderRec(INode<T> root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }
}