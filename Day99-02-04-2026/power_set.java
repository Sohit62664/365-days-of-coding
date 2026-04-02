package Recursion;

public class power_set {
    public static void main(String[] args) {
        power_set_printer("abc", 0, "");
    }

    static void power_set_printer(String str, int index, String current) {

        
        System.out.println(current);

        for (int i = index; i < str.length(); i++) {
            power_set_printer(str, i + 1, current + str.charAt(i));
        }
    }
}
