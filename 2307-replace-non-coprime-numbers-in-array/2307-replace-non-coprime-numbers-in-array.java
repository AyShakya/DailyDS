class Solution {
    public int LCM(int a, int b){
        return (a / gcd(a, b)) * b; 
    }
    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public List<Integer> replaceNonCoprimes(int[] nums) {
        Deque<Integer> dq = new ArrayDeque<>();
        int n = nums.length;
        for(int num : nums){
            dq.push(num);
            while(dq.size()>1){
                int a = dq.pop();
                int b = dq.pop();
                int g = gcd(a,b);
                if(g>1){
                    dq.push(LCM(a,b));
                }
                else{
                    dq.push(b);
                    dq.push(a);
                    break;
                }
            }
        }
        List<Integer> ans = new ArrayList<>(dq);
        Collections.reverse(ans);
        return ans;
    }
}