// import java.util.*;

// public class Football{
//     public static void main(String [] a){
//         Scanner sc = new Scanner(System.in);
//         String p = sc.nextLine();
        
//         int one =0 ;
//         int zero = 0 ;
        
//         int localzero =0 ;
//         int localone= 0 ;
        
//         for(int i=1 ; i< n ; i++){
            
//             char ch= p.charAt(i);
//             char pre = p.charAt(i-1);
            
//             if(pre!= ch){
//                 if(ch == '1'){
//                     one = math.max(localone , one);
//                     localone = 1;
//                 }else{
//                     zero = math.max(localzero , zero);
//                     localzero = 1;
//                 }
//             }else{
//                 if(pre== '1'){
//                     localone++;
//                 }else{
//                     localzero++;
//                 }
//             }
//         }
        
        
        
//         if(one>=7 || zero >= 7){
//             System.out.println("YES");
//         }else{
//             System.out.println("NO")
//         }
//     }
// }






import java.util.*;

public class Football{
    public static void main(String [] a){
        Scanner sc = new Scanner(System.in);
        String p = sc.nextLine();
        
        int n= p.length();
        int count = 1 ; 
        boolean flag = false;
        
        
        for(int i =1; i< n ; i++){
            char pre = p.charAt(i-1);
            char curr = p.charAt(i);
            if(pre == curr){
                count++;
                if(count == 7){
                    System.out.println("YES");
                    flag = true;
                    break;
                }
            }else{
                count = 1;
            }
        }
        
        if(!flag){
            System.out.println("NO");
        }
    }
}
