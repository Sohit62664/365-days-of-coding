package Day24;

import java.util.*;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n= s.length();
        int [] ans= new int [(n/2)+1];
        int j = 0;
        for(int i =0 ; i< n ; i+=2){
            int t=  Integer.parseInt(String.valueOf(s.charAt(i)));
            ans[j]=t;
            j++;
        }
        Arrays.sort(ans);
        
        StringBuilder builder = new StringBuilder();
        for(int i =0 ; i<ans.length ; i++){
            builder.append(ans[i]);
            if(i!=ans.length-1){
                builder.append("+");
            }
        }
        System.out.println(builder.toString());
    }
}