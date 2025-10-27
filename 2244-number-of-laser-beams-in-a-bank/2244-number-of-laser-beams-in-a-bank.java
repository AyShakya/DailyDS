class Solution {
    public int numberOfBeams(String[] bank) {
        List<Integer> ans = new ArrayList<>();
        for(String s : bank){
            int c = 0;
            for(char ch : s.toCharArray()){
                if(ch=='1') c++;
            }
            if(c!=0) ans.add(c);
        }
        int res = 0;
        int n = ans.size();
        for(int i=0;i<n-1;i++){
            res+= ans.get(i)*ans.get(i+1);
        }
        return res;
    }
}