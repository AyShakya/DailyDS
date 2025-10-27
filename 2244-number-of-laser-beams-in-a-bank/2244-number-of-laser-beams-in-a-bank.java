class Solution {
    public int numberOfBeams(String[] bank) {
        int prev = 0;
        int res = 0;
        int c = 0;
        for(String s : bank){
            if(c!=0){
                prev = c;
            }
            c=0;
            for(char ch : s.toCharArray()){
                if(ch=='1') c++;
            }
            if(c!=0){
                res+=prev*c; 
            };
        }
        return res;
    }
}