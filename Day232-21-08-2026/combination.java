import java.util.ArrayList;
import java.util.List;

public class combination {
    static void recurse(int n , int i , int k , List<Integer> list ){
        if(list.size()== k){
            System.out.println(list.toString());
            return;
        }
        if(i == n ) return ; 
        list.add(i+1);
        recurse(n , i+1 , k , list);
        list.remove(list.size()-1);
        recurse(n, i+1, k, list);

        
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        recurse(4 , 0 , 2 , list );
    }
}
