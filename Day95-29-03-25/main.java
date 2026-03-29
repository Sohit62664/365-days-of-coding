public class main {
    public static void main(String[] args) {
        // BST tree = new BST();
        // // int [] nums= {5,2,7,1,4,6,9,8,3,10};
        // int [] nums = {1,2,3,4,5,6,7,8,9};

        // tree.populateSorted(nums);
        // tree.display();

        BST1 tree = new BST1();
        // int [] nums= {5,2,7,1,4,6,9,8,3,10};
        int [] nums = {1,2,3,4,5,6,7,8,9};
        // tree.populate(nums);
        tree.populateSorted(nums);
        tree.display();
    }
}
