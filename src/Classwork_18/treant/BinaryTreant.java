package Classwork_18.treant;

public class BinaryTreant {
    public static void main(String[] args) {
        Node A = new Node('A');
        Node B = new Node('B');
        Node C = new Node('C');
        Node D = new Node('D');
        Node E = new Node('E');
        A.setLeft(B);
        A.setRight(C);
        B.setLeft(D);
        B.setRight(E);

        Treant treant = new Treant(A);
        treant.preOrder(A);
        System.out.println();
        treant.postOrder(A);
        System.out.println();
        treant.inOrder(A);
    }
}

class Node{
    private char key; //Значение
    private Node left; //левый элемент
    private Node right; //правый элемент
    public Node(char key) {
        this.key = key;
    }

    public char getKey() {
        return key;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}

class Treant{
    private Node root;

    public Treant(Node root) {
        this.root = root;
    }

    //Прямой, обратный, симметричный обходы(preOrder,postOrder,inOrder)
    public void preOrder(Node node){
        System.out.print(node.getKey());
        if (node.getLeft()!=null){
            preOrder(node.getLeft());
        }
        if (node.getRight()!=null){
            preOrder(node.getRight());
        }
    }

    public void postOrder(Node node){
        if (node.getLeft()!=null){
            postOrder(node.getLeft());
        }
        if (node.getRight()!=null){
            postOrder(node.getRight());
        }
        System.out.print(node.getKey());
    }

    public void inOrder(Node node){
        if (node.getLeft()!=null){
            inOrder(node.getLeft());
        }
        System.out.print(node.getKey());
        if (node.getRight()!=null){
            inOrder(node.getRight());
        }
    }
}


