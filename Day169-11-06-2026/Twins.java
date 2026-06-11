//https://codeforces.com/problemset/problem/160/A


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Twins {
    public static void main(String[] arggs) {
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();
        int total = 0 ;
        ArrayList<Integer> seq = new ArrayList<>();
        for(int i =0 ; i< n ; i++){
            int c = sc.nextInt();
            total+=c ;
            seq.add(c);
        }

        Collections.sort(seq,Collections.reverseOrder());
        int twin= 0;
        int count =0 ;
        for(int i =0 ; i<n ; i++){
            if(twin<=total){
                twin+=seq.get(i);
                total-=seq.get(i);
                count++;
            }else{
                break;
            }
        }

        System.out.println(count);

        

    }

}
