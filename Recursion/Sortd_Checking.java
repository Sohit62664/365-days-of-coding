package Recursion;

public class Sortd_Checking {
    public static void main(String[] args) {
        int [] num = {1,2,3,5,6,7};

        System.out.println(sorted(1 , num));
        if(sorted(1 , num)){
            System.out.println("need not to sort");
        }else{
            System.out.println("need to sort");
        }
    }

    static boolean sorted(int i ,int [] num){
        if(i > num.length -1) return true;
        if(num[i-1]>num[i]) return false ;

        return sorted(i+1 , num);
    }
}
