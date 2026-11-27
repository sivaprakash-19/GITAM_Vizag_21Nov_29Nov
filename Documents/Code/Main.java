package Day7;


import java.util.*;

public class Main {

    public static Node buildTree(Scanner sc, String message){
        System.out.print(message);
        int data = sc.nextInt();
        if(data == -1) {
            return null;
        }
        Node root = new Node(data);
        root.left = buildTree(sc, "Enter left of " + data + " : ");  // Build tree recursively on left
        root.right = buildTree(sc, "Enter right of " + data + " : "); // Build tree recursively on right
        return root;
    }
    public static void dFT(Node root) {
        if(root == null) {
            return;
        }
        System.out.print(root.data + " : ");
        if(root.left != null) {
            System.out.print("L" + root.left.data + " ");
        }
        if(root.right != null) {
            System.out.print("R" + root.right.data);
        }
        System.out.println();
        dFT(root.left);
        dFT(root.right);
    }

    public static void bFT(Node root) {
        if(root == null)
            return;
        Queue<Node> pendingNodes = new LinkedList<>();
        pendingNodes.add(root);
        while(!pendingNodes.isEmpty()) {
            Node current = pendingNodes.poll();
            System.out.print(current.data + " ");
            if(current.left != null)
                pendingNodes.add(current.left);
            if(current.right != null)
                pendingNodes.add(current.right);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node root = buildTree(sc, "Enter root data : ");
        dFT(root);
        bFT(root);

        /*
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(24);
        Node n5 = new Node(45);
        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n4.left = n5;
        dFT(n1);
         */
    }
}
