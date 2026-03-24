// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        
        String str = "geeksforGeeKS";
        char res = first(str,0);
        if (res == 0)
            System.out.println("No uppercase letter");
        else
            System.out.println (res );
        
    }
    
    static char first(String str , int i){
        if(i< str.length()){
            int ch = str.charAt(i); //convrts char -> int 
            if(ch<=90 && ch >=65){
                return str.charAt(i);
            }
            return first(str , i+1);
        }
        return 0;
    }
}


// Char → ASCII
// char ch = 'A';
// int val = ch;
// System.out.println(val); // 65


// int val = 97;
// char ch = (char) val;
// System.out.println(ch); // 'a'


// ✔ Uppercase → Lowercase
// char ch = 'A';
// char lower = (char)(ch + 32); // 'a'

// ✔ Lowercase → Uppercase
// char ch = 'a';
// char upper = (char)(ch - 32); // 'A'
