public class MainUC3 {
    public static void main(String[] args) {
        BinaryTree<Integer> tree = new BinaryTree<>();

        tree.root = new TreeNode<>(56);
        tree.root.left = new TreeNode<>(30);
        tree.root.right = new TreeNode<>(70);

        tree.root.left.left = new TreeNode<>(22);
        tree.root.left.right = new TreeNode<>(40);
        tree.root.left.left.left = new TreeNode<>(11);

        tree.root.right.left = new TreeNode<>(60);
        tree.root.right.right = new TreeNode<>(95);
        tree.root.right.left.left = new TreeNode<>(65);
        tree.root.right.left.right = new TreeNode<>(63);
        tree.root.right.right.right = new TreeNode<>(67);

        tree.printLevelOrder();

        System.out.println("\nThe size of the binary tree is: " + tree.size());

        Integer searchValue = 63;
        boolean found = tree.search(searchValue);
        System.out.println("Is value " + searchValue + " present in the tree? " + found);
    }
}