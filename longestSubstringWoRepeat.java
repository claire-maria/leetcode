class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s==null||s.length()==0){
        return 0;
        }
        int result = 0;
        int k = 0;
        HashSet<Character> set = new HashSet<Character>();
        for(int i = 0 ; i < s.length() ; i++){
            char x = s.charAt(i);
            if(!set.contains(x)){
                set.add(x);
                result = Math.max(result, set.size());
            }
            else{
                while(k<i){
                    if(s.charAt(k)==x){
                        k++;
                        break;
                    }
                    else{
                    set.remove(s.charAt(k));
                    k++;
                }
                }
            }
        }
        return result;
        
        
    }
}