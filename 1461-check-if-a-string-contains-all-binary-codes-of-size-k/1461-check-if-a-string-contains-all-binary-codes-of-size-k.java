class Solution {
    public boolean hasAllCodes(String s, int k) {
        int total = 1 << k;
        Set<String> hs = new HashSet<>();
        for(int i=0;i+k<=s.length();i++){
            String sub = s.substring(i, i+k);
            if(hs.add(sub)){
                if(hs.size()==total) return true;
            }
        }
        return false;
    }
}