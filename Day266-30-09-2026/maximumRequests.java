class Solution {
    int max_req =0 ; 

    public int maximumRequests(int n, int[][] requests) {
        HashMap<Integer , Integer> map = new HashMap<>();
        int[] balance = new int[n];
        helper(requests , 0 , balance , 0);

        return max_req;
    }

    void helper(int [][] requests , int index , int [] balance  , int req_count){
        if(index == requests.length ){
            for(int x: balance){
                if(x!= 0) return ;
            }

            max_req = Math.max(max_req , req_count);
            return;
        }
        for(int start = index ; start < requests.length ; start++){
            int source = requests[start][0];
            int destination = requests[start][1];

            balance[source]--;
            balance[destination]++;
            req_count++;
            helper(requests , start+1 , balance , req_count);

            balance[source]++;
            balance[destination]--;

            req_count--;
        }
    }
}
