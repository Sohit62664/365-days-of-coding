import java.util.*;


public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            int N = sc.nextInt();
            int K = sc.nextInt();

            

            int [] nums = new int[N];

            
            for(int i=0 ; i< N ; i++){
                nums[i]= sc.nextInt();
            }


            //Solution 
            PriorityQueue<Integer>  q = new PriorityQueue<>();
            int t_sum = 0 ;
            int q_size = K;
            if(N-K > K){
                q_size= N-K;
            }

            for(int num : nums){
                t_sum+=num;
                q.offer(num);
                if(q.size()>q_size){
                    q.poll();
                }
            }
            int q_sum = 0 ;
            while(!q.isEmpty()){
                q_sum+=q.poll();
            }

            int remaining_sum= t_sum-q_sum;

            int diff = Math.abs(remaining_sum-q_sum);
            System.out.println(diff);
            T--;

        }
    }
}



// If O(N log N) comfortably fits the constraints and sorting makes the solution much simpler, use sorting.
