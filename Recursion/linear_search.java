package Recursion;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class linear_search {

    public static void main(String[] args) {
        int [] num = {1,7,2,3,787,787,3,5,6,7};
        ArrayList<Integer> list = l_search(num, 3 , 0);

        for(int i =0 ; i< list.size() ; i++){
            System.out.println(list.get(i));
        }
    }
    static ArrayList<Integer> list = new ArrayList<>();

    static ArrayList l_search(int [] num , int target , int i){
        if(i > num.length-1) return list;
        if(num[i]== target) list.add(i);
        return l_search(num, target, i+1);
    }
}