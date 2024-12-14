class Node {
    int value;
    Node left, right;

    public Node(int value) {
        this.value = value;
        left = right = null;
    }
}

class BinarySearchTree {
    Node root;

    // Ekleme işlemi
    public void insert(int value) {
        root = insertRec(root, value);
    }

    private Node insertRec(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }

        if (value < root.value) {
            root.left = insertRec(root.left, value);
        } else if (value > root.value) {
            root.right = insertRec(root.right, value);
        }

        return root;
    }

    // Ağacı yazdırma (In-Order Traversal)
    public void printTree(Node root) {
        if (root != null) {
            printTree(root.left);
            System.out.print(root.value + " ");
            printTree(root.right);
        }
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        int[] arr = {7, 5, 1, 8, 3, 6, 0, 9, 4, 2};

        // Diziyi BST'ye ekleme
        for (int value : arr) {
            tree.insert(value);
        }

        System.out.println("Binary Search Tree (In-Order Traversal):");
        tree.printTree(tree.root); // In-order traversal ile sıralı çıktı alır.
    }
}
