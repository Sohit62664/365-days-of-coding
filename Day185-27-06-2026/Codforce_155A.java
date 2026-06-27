import java.util.*;


public class Solver{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
         int max ;
         int min ;
         
         
        int n = sc.nextInt();
        // sc.nextLine();
         
        max = sc.nextInt() ;
        min = max ;

        
        int [] ratings =  new int[n-1];
        for(int i = 0 ; i< n-1 ;i++ ){
            int t = sc.nextInt();
            
            ratings[i] = t;
            
            
        }
        
        int amazing = 0 ;
        
        
        // in siple word Question is count number of increasing or decresing
        // skip first element 
        // ratings[0] = ratings[1];
        for(int score : ratings){
            
            
            if(score> max){
                amazing++;
                max = score;
            }else if(score < min){
                amazing++;
                min = score;
            }
        }
        
        System.out.println(amazing);
    }
}
