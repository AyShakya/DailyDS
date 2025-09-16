import java.math.BigInteger;
class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        Deque<Integer> dq = new ArrayDeque<>();
        int n = nums.length;
        for(int num : nums){
            dq.push(num);
            while(dq.size()>1){
                int a = dq.pop();
                int b = dq.pop();
                int g = BigInteger.valueOf(a).gcd(BigInteger.valueOf(b)).intValue();
                if(g>1){
                    dq.push((a/g) * b);
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