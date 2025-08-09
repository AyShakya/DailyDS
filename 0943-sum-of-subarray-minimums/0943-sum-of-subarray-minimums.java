class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        int nse[] = new int[n];
        int pse[] = new int[n];
        Stack<Integer> s = new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && arr[i]<=arr[s.peek()]){
                s.pop();
            }
            nse[i] = s.isEmpty() ? n : s.peek();
            s.push(i);
        }
        s.clear();
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && arr[i]<arr[s.peek()]){
                s.pop();
            }
            pse[i] = s.isEmpty() ? -1 : s.peek();
            s.push(i);
        }
        long sum = 0; 
        final int MOD = 1_000_000_007;
        for(int i=0;i<n;i++){
            long left = nse[i] - i;
            long right = i - pse[i];
             sum = (sum + (arr[i] * left * right) % MOD) % MOD;
        }
        return (int)sum;
    }
}