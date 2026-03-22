package Trees;

import java.util.Scanner;

public class Binary_Tree {

    public Binary_Tree(){

    }

    private static class Node{
        int value;
        Node left ;
        Node right;

        public Node(int val){
            this.value = val;
        }
    }
    
    private Node root ;


    //insert element 
    public void populate(Scanner sc){
       System.out.println("Enter the Root Node : ");
       int value = sc.nextInt();
       root = new Node(value);
       populate(sc , root); 
    }

    private void populate(Scanner sc , Node node){
        System.out.println("Enter true for left of "+ node.value + " otherwice false :");
        boolean left = sc.nextBoolean();
        if(left){
            System.out.println("Enter the left Node of "+ node.value);
            int value = sc.nextInt();
            node.left = new Node(value);
            populate(sc , node.left);
        }

        System.out.println("Enter true for right of "+ node.value + " otherwice false :");
        boolean right = sc.nextBoolean();
        if(right){
            System.out.println("Enter the right Node of "+ node.value);
            int value = sc.nextInt();
            node.right = new Node(value);
            populate(sc , node.right);
        }
    }
    public void display(){
        display(root , "");
    }
    
    private void display(Node node, String indent){
        if(node==null){
            return;
        }
        System.out.println(indent + node.value);
        display(node.left , indent +"\t");
        display(node.right , indent +"\t");
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Binary_Tree tree = new Binary_Tree();
        tree.populate(sc);
        tree.display();
    }
}
