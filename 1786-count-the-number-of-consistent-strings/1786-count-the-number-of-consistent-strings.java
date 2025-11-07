class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int a[] = new int[26];
        for(char ch : allowed.toCharArray()){
            a[ch-'a']++;
        }
        int c = 0;
        Boolean flag = false;
        for(String s : words){
            flag = false;
            for(char ch : s.toCharArray()){
                if(a[ch-'a']==0){
                    flag = true;
                    break;
                }
            }
            if(flag) continue;
            c++;
        }
        return c;
    }
}