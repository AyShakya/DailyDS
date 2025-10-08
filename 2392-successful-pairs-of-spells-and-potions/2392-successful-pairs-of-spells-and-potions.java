class Solution {
    public int bs(int[] raw, int left, int right, long x, long val){
        int res = raw.length;
        while(left<=right){
            int mid = left + (right-left)/2;
            long prod = val * (long) raw[mid];
            if(prod>=x){
                res=mid;
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return res;
    }
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n = spells.length;
        int m = potions.length;
        int ans[] = new int[n];
        Arrays.sort(potions);
        for(int i=0;i<n;i++){
            long val = (long)spells[i];
            int idx = bs(potions, 0, m-1, success, val);
            ans[i] = m-idx;
        }
        return ans;
    }
}