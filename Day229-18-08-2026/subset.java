import java.util.ArrayList;

public class subset {
    static ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    static void subsets(int[] arr, int i, ArrayList<Integer> current) {
        if(i== arr.length){
            System.out.println(current.toString());
            list.add(new ArrayList<>(current)); // new Arraylist because if we do backtrack then the orignal which is refrencing to the every element of ans list will modified and become empty 
            return;
        }

        subsets(arr , i+1  , current);
        current.add(arr[i]);
        subsets(arr, i+1 , current);
        current.remove(current.size()-1);

        
    }


    public static void main(String[] args) {
        int arr [] = {1 ,2, 3};
        ArrayList<Integer> current = new ArrayList<>();
        subsets(arr, 0 , current);

        System.out.println(list.toString());
    }
}

/**
 * // base case
 * 
 * // choose arr[i]
 * 
 * // recurse
 * 
 * // undo arr[i]
 * 
 * // don't choose arr[i]
 * 
 * // recurse
 */
