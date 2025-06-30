class Solution {
    public int[] dailyTemperatures(int[] k) {
        int n = k.length;
        int ans[] = new int[n];
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && k[i]>k[s.peek()]){
                int index = s.pop();
                ans[index] = Math.abs(index-i);
            }
            s.push(i);
        }
        return ans;
    }
}