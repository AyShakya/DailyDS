class Solution {
    public int beautySum(String s) {
        int sum=0;
        int n = s.length();
        for(int i=0;i<n;i++){
            int[] freq = new int[26]; 
            for (int j = i; j < n; j++) {
                char ch = s.charAt(j);
                freq[ch - 'a']++;
                int maxFreq = 0, minFreq = Integer.MAX_VALUE;
                for (int f : freq) {
                    if (f > 0) { 
                        maxFreq = Math.max(maxFreq, f);
                        minFreq = Math.min(minFreq, f);
                    }
                }
                sum += (maxFreq - minFreq);
            }
        }
        return sum;
    }
}