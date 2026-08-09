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
            PriorityQueue<Integer>  q = new PriorityQueue<>();// min heap 
            // PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder()); // prefer this because it's size will always be lesser than the max heap store min(k , n-k) smallest elements

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



// Since the constraints are very low N <= 100 and wi <= 10^5  so use sorting 
// In OA round you see if constraints are simple then don't necessary go for more complex algo to reduse complexity just go with nlogn if you able to solve 
// if the constraints isgreter then 10^6 then try to do in O(n) 
// if we only need to get K minimum or k maximum then use Priority Queue 
//if we have asked to take only min , max then no need for sorting kind of stuff just go with the O(n) solution 


// O(NlogN) solution



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
            Arrays.sort(nums);
            int min_sum = 0 ;
            int max_sum = 0 ;
            int min_size = Math.min(K , N-K) ;

            for(int i=0 ; i< N ; i++){
                if(i< min_size){
                    min_sum += nums[i];
                }else{
                    max_sum+= nums[i];
                }
            }

            System.out.println(Math.abs(min_sum-max_sum));
        }
    }
}




