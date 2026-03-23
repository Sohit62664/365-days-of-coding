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
        System.out.println();
        preetyDisplay(root , 0);
    }
    
    private void preetyDisplay(Node node , int level){
        if(node == null) return ;

        preetyDisplay(node.right, level +1);
        if(level!=0){
            for(int i = 0 ; i< level-1 ; i++){
                System.out.print("|\t\t");
            }
            System.out.println("|------->"+node.value);

        }else{
            System.out.println(node.value);
        }
        preetyDisplay(node.left , level+1);
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



// Output 
// Enter the Root Node : 
// 15
// Enter true for left of 15 otherwice false :
// true
// Enter the left Node of 15
// 6
// Enter true for left of 6 otherwice false :
// true
// Enter the left Node of 6
// 8
// Enter true for left of 8 otherwice false :
// false
// Enter true for right of 8 otherwice false :
// true
// Enter the right Node of 8
// 10
// Enter true for left of 10 otherwice false :
// false
// Enter true for right of 10 otherwice false :
// false
// Enter true for right of 6 otherwice false :
// true
// Enter the right Node of 6
// 14
// Enter true for left of 14 otherwice false :
// false
// Enter true for right of 14 otherwice false :
// false
// Enter true for right of 15 otherwice false :
// true
// Enter the right Node of 15
// 9
// Enter true for left of 9 otherwice false :
// false
// Enter true for right of 9 otherwice false :
// false
// 15
// 	6
// 		8
// 			10
// 		14
// 	9
//
//
//
//
// |------->9
// 15
// |		|------->14
// |------->6
// |		|		|------->10
// |		|------->8




