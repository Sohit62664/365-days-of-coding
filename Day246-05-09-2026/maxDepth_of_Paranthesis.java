//First Attempt  138 test case pases 
class Solution {
    int max = 0 ;

    public int maxDepth(String s) {
        int count = 0 ;
        for(int i= 0 ; i< s.length() ; i++){
            char ch = s.charAt(i);
            if(ch != '(' && ch!=')'){
                continue;
            }

            if(ch== '(') count++;
            if(ch == ')'){
                max = Math.max(max , count);
                count=0;
            }
        }
        return max;
    }
}


//Second Attempt - correct Approach 

class Solution {
    int max = 0 ;

    public int maxDepth(String s) {

        Stack <Character> st = new Stack<>();

        int count = 0 ;
        for(int i= 0 ; i< s.length() ; i++){
            char ch = s.charAt(i);
            if(ch != '(' && ch!=')'){
                continue;
            }

            if(ch== '('){
                st.push('(');
            }else if(ch == ')'){
                max = Math.max(max , st.size());
                st.pop();
            }
        }
        return max;
    }
}
