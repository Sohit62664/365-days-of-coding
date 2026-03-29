public class BST1 {
    class Node {
        private int value;
        private int height ;
        private Node left ; 
        private Node right ;
        
        public Node( int value){
            this.value= value;
            this.height = 0;
        }
        public int getValue(){
            return value ;
        }
    }

    private  Node root;

    BST1(){

    }

    public void isEmpty(){
        if(root == null){
            System.out.println("Tree is Empty");
        }else{
            System.out.println("Tree is Not Empty");
        }
    }

    public int getValue(Node node){
        return node.value;
    }
    public int getheight(Node node){
        if(node == null ) return -1 ; 
        return node.value;
    }
    
    public void insert(int value){
        root = insert(root , value);
    }

    private Node insert(Node node , int value){
        if(node == null){
            return node = new Node(value);
        }

        if(value<node.value ){
            node.left = insert (node.left , value );
        }
        else if (value>node.value){
            node.right = insert(node.right , value);
        }

        node.height = Math.max(getheight(node.left) , getheight(node.right));
        return node;
    }





    public void display(){
        display(root , "Root Node ");
    }

    private void display(Node node  , String details ){
        if(node == null){
            return;
        }

        System.out.println(details + node.value);

        display(node.left , "Left Node of " + node.getValue() + " : ");
        display(node.right , "Right Node of " + node.getValue() + " : ");

    }

    public boolean balanced(){
        return balanced(root);
    }

    private boolean balanced(Node node){
        if(node == null ){
            return true;
        }
        return Math.abs(getheight(node.left)- getheight(node.right))<=1 && balanced(node.left) && balanced(node.right);
    }



    public void populate(int [] nums){
        for(int i = 0; i < nums.length ; i++){
            insert(nums[i]);
        }
    }

    public void populateSorted(int [] nums){
        populateSorted(nums , 0 , nums.length-1);
    }

    private void populateSorted(int [] nums , int st , int end){
        if (st>end ) return ;
        int mid = st + (end-st)/2;
        insert(nums[mid]);
        populateSorted(nums , st , mid-1);
        populateSorted(nums , mid+1 , end);
    }
}
