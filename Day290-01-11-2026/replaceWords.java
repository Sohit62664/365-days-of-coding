class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        String [] sent = sentence.split(" ");

        for(int i =0 ; i< sent.length ; i++){
            String root = substr(sent[i] , dictionary);
            if(root.length() != 0){
                sent[i] = root;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(sent[0]);
        for(int i =1 ; i< sent.length ; i++){
            sb.append(" ");
            sb.append(sent[i]);
        }

        // return Arrays.toString(sent);
        return sb.toString();
    }

    String substr(String word ,List<String> ls){
        
        String ans = "";
        int size = Integer.MAX_VALUE;
        for(int i =0 ; i< ls.size() ; i++){
            String root = ls.get(i);
            int end = root.length() ;
            if(end>word.length()){
                continue ;
            }
            String w = word.substring(0 , end);

            if(w.equals(root)){
                if(end < size){
                    ans = root;
                    size = end;
                }
            }
        }
        return ans;
    }
}
