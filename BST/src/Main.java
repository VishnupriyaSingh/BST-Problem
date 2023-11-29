public class Main {
    public static void main(String[] args) {
        MyBinaryNode<Integer> tree = new MyBinaryNode<>();

        tree.insert(56);

        tree.insert(30);
        tree.insert(70);

        tree.inorder();
    }
}