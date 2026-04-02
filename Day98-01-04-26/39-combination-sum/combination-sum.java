class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        DFS(0 , target , result , current , candidates  );
        return result;

    }

    public void DFS(int st , int target , List<List<Integer>> result , List<Integer> current , int [] candidates){
        if(target == 0){
            result.add(new ArrayList<>(current));
            return;
        }

        if(target< candidates[st]){ // this is possible becauce of sorting
            return;
        }

        for(int i = st ; i< candidates.length ; i++){
            current.add(candidates[i]);

            DFS(i , target - candidates[i] , result , current, candidates);

            //backtracking
            current.remove(current.size() - 1);
        }
    }
}