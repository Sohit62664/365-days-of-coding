class Solution {
    public int numSpecial(int[][] mat) {
        // HashSet<Integer> row = new HashSet<>();
        // HashSet<Integer> column = new HashSet<>();
        int count= 0 ;
        for(int i =0 ; i< mat.length ; i++){
            for(int j = 0 ; j< mat[0].length ; j++){
                // if(row.contains(i)){
                //     break;
                // }else 
                if(mat[i][j]==1){
                    // row.add(i);
                    // column.add(j);
                    if(checkrow(mat , i , j) && checkcolumn(mat ,i ,j) ){
                        count++;
                    }
                }
            }
        }
        return count;

    }

    boolean checkrow(int [][] mat , int i , int j ){
        
        for(int k =0 ;k< mat[0].length ; k++){
            if(mat[i][k]==1 && k!=j){
                return false;
            }
        }
        return true;
    }

    boolean checkcolumn(int [][] mat , int i , int j ){
        
        for(int k =0 ;k< mat.length ; k++){
            if(mat[k][j]==1 && k!=i){
                return false;
            }
        }
        return true;
    }
}