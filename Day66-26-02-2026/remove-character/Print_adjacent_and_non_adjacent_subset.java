package Recursion;

public class printing_subset {
    //printing Non Contigious subset

    public static void main(String[] args) {
        printer("" , "abc");
    }

    static void printer(String up ,String p ){
        if(p.isEmpty()){
            System.out.println(up);
            return ;
        }
        char ch = p.charAt(0);
        printer(up+ch, p.substring(1));
        printer(up , p.substring(1));
    }
}
