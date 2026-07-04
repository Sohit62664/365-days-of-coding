import java.util.Scanner;

public class Bit_Manupulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n ;
        System.out.print("Enter the decimal value :");

        n = sc.nextInt();
        System.out.println();
        // Get bit at position 2
        int pos = 2 ;
        getBit(n , pos);
        setBit(n , pos);
        updateBit(n , pos , false);
        clearBit(n , pos);

    }

    private static void clearBit(int n, int pos) {
        int bitmask =  1<<pos ;
        bitmask = ~bitmask ;

        int num = bitmask & n ;

        System.out.println("After clearing the bit answer is "+ num );
        
    }

    private static void updateBit(int n, int pos , boolean set) {

        int bitmask = 1 << pos ;
        // if set bit
        if(set){
            int num = bitmask | n ;
            System.out.println("After updation operation " + num );

        }else{
            bitmask = ~bitmask ;
            int num = bitmask & n ; //clear
            System.out.println("After updation operation " + num );
        }

    }

    private static void setBit(int n, int pos) {
        //change the bit 
        int bitmask = 1 << pos ;
        int num = bitmask | n ;
        System.out.println("the update value of n is "+ num );

    }

    private static void getBit(int n, int pos) {
        int bitmask = 1 << pos ;
        int bit = (bitmask & n)!=0 ? 1 : 0 ; 
        System.out.println("at position "+pos + " the bit is " +bit);
    }
}
