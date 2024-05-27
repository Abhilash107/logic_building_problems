package csw;

class Node {
    public int value;
    public Node left, right;

    // Constructor
    public Node(int element) {
        value = element;
        left = right = null;
    }

    void traversePreorder(Node node) {
        if (node == null)
            return;
        System.out.print(node.value + " ");
        traversePreorder(node.left);
        traversePreorder(node.right);
    }

    void traverseInorder(Node node) {
        if (node == null)
            return;
        traverseInorder(node.left);
        System.out.print(node.value + " ");
        traverseInorder(node.right);
    }

    void traversePostorder(Node node) {
        if (node == null)
            return;
        traversePostorder(node.left);
        traversePostorder(node.right);
        System.out.print(node.value + " ");
    }
}

public class binary_Tree {
    Node root; // Root of the tree

    // Constructor
    binary_Tree() {
        root = null;
    }

    public static void main(String[] args) {
        // Create tree object
        binary_Tree pt = new binary_Tree();
        
        // Create root node
        pt.root = new Node(36);
        
        // Create other nodes
        pt.root.left = new Node(26);
        pt.root.right = new Node(46);
        pt.root.left.left = new Node(21);
        pt.root.left.right = new Node(31);
        pt.root.left.left.left = new Node(11);
        pt.root.left.left.right = new Node(24);
        pt.root.right.left = new Node(41);
        pt.root.right.right = new Node(56);
        pt.root.right.right.left = new Node(51);
        pt.root.right.right.right = new Node(66);

        // Call traversal methods
        System.out.println("Preorder traversal:");
        pt.root.traversePreorder(pt.root);
        System.out.println();

        System.out.println("Inorder traversal:");
        pt.root.traverseInorder(pt.root);
        System.out.println();

        System.out.println("Postorder traversal:");
        pt.root.traversePostorder(pt.root);
        System.out.println();
    }
}
