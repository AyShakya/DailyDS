class Solution {
    public int minimumDeletions(String s) {
        int n = s.length();
        int[] cA = new int[n];
        int[] cB = new int[n];
        int countA = 0;
        int countB = 0;

        for(int i=0;i<n;i++){
            cB[i] = countB;
            if(s.charAt(i) == 'b') countB++;  
        }
        for(int i=n-1;i>=0;i--){
            cA[i] = countA;
            if(s.charAt(i) == 'a') countA++;  
        }

        int minAns = n;
        for(int i=0;i<n;i++){
            minAns = Math.min(minAns, cA[i] + cB[i]);
        }
        return minAns;
    }
}