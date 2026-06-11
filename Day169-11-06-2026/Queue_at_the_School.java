// https://codeforces.com/problemset/problem/266/B
// the boy will go at the position i+1 and thegirl will be at position of the boy 
// // for each second find all Bg and Swap them 


// until t 
// till then search left to right BG if Got then swap 


import java.util.Scanner;

public class Queue_at_the_School{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int t = sc.nextInt();
        sc.nextLine();
        String ins = sc.nextLine();
        StringBuilder s = new StringBuilder(ins);
        while(t > 0){
            for(int i =1 ; i< s.length() ; i ++){
                if(s.charAt(i-1) == 'B' && s.charAt(i)=='G'){
                    // swap
                    char temp = s.charAt(i);
                    s.setCharAt(i , s.charAt(i-1));
                    s.setCharAt(i-1 , temp);
                    i++;
                }
            }
            t--;
        }

        System.out.println(s);
    }

}
