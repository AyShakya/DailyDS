class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> cal = new HashMap<>();
        for(int i=0;i<s.length();i++){
            cal.put(s.charAt(i),cal.getOrDefault(s.charAt(i),0)+1);
        }
        int count=0;
        Boolean val = true;
        for(Map.Entry<Character,Integer> entry : cal.entrySet()){
            if(entry.getValue()%2==0){
                count+=entry.getValue();
            }
            else{
                if(val==true){
                    count+=entry.getValue();
                    val=false;
                }
                else{
                    count+=entry.getValue()-1;
                }
            }
        }
        return count;
    }
}