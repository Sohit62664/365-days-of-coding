class Solution {
    public int[] exclusiveTime(int n, List<String> logs) {
        int [] ans = new int[n];
        Deque<Integer> stack =new ArrayDeque<>();
        int pre = 0;

        for(String log : logs){

            String[] parts = log.split(":");


            int id = Integer.parseInt(parts[0]);
            char op= parts[1].charAt(0);
            int timestemp =Integer.parseInt(parts[2]);

            if(op=='s'){
                if(!stack.isEmpty()){
                    int fid= stack.peek();

                    ans[fid]+=timestemp-pre;
                    

                }
                stack.push(id);
                    
                    pre = timestemp;
            }

            if(op == 'e'){
                int fid= stack.pop();
                // stack.push(timestemp - pre +1 )
                ans[fid]+=timestemp - pre +1;
                
                pre=timestemp+1;
            }
        }
        return ans;
    }
}