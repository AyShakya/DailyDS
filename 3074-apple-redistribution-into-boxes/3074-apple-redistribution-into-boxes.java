class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int m = capacity.length;
        int a = 0;
        for(int i : apple) a+=i;
        Arrays.sort(capacity);
        int c = 0, ans = 0;
        for(int i = m-1;i>=0;i--){
            c+=capacity[i];
            ans++;
            if(c>=a){
                return ans;
            }
        }
        return -1;
    }
}