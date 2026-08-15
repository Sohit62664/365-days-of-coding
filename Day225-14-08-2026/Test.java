public class Test {

    static long count = 0;

    static void fun() {
        count++;
        fun();
    }

    public static void main(String[] args) {
        try {
            fun();
        } catch (StackOverflowError e) {
            System.out.println("Calls: " + count);
        }
    }
}


//output 
// 15931
// 15392
// 16164
// 16624
// 15888
// 16439