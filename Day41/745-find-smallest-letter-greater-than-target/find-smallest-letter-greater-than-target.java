class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        // int st= 0;
        // int end = letters.length-1;

        // while(st<= end){
        //     int mid= st+ (end-st)/2;
        //     // if(letters[mid]== target) return letters[st];
        //     if(letters[mid] > target) end= mid-1;
        //     else st=mid+1;
        // }
        // return letters[st% letters.length]; 
        target++;
        for(int i= 0 ; i< 26; i++){
            int flag= bin_search(letters, target++);
            if(flag!=-1){
                return letters[flag];
            }
        }
        return letters[0];

    }
    public static int bin_search(char[] letters , char target){
        int st=0;
        int end=letters.length-1;
        while(end>=st){
            int mid = st+ (end-st)/2;
            if(letters[mid]==target){return mid;}
            else if(letters[mid]>target){
                end= mid-1;
            }else{
                st=mid+1;
            }
        }

        return -1;
    }
}