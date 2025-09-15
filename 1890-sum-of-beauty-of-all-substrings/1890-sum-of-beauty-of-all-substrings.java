class Solution {
    public int beauty(String s, int a, int b){
        int maxA=0, minB=1000;
        int []k = new int[26];
        for(int i=a;i<=b;i++){
            char ch = s.charAt(i);
            k[ch-'a']++;
        }
        for(int i=a;i<=b;i++){
            char ch = s.charAt(i);
            if(k[ch-'a']>maxA){
                maxA=k[ch-'a'];
            }
            if(k[ch-'a']<minB){
                minB=k[ch-'a'];
            }
        }
        return maxA-minB;
    }
    public int beautySum(String s) {
        int sum=0;
        int n = s.length();
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                sum+=beauty(s, i, j);
            }
        }
        return sum;
    }
}