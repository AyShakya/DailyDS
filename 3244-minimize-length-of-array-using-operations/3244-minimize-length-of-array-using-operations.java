class Solution {
    public int minimumArrayLength(int[] nums) {
        Arrays.sort(nums);
        Deque<Integer> dq = new ArrayDeque<>();
        for (int num : nums) {
            dq.addLast(num);
        }
        int c=0;
        while (dq.size() > 1) {
            int a = dq.pollFirst();   
            int b = dq.pollLast();    
            int r1 = a % b;
            int r2 = b % a;
            int res;
            if (r1 == 0 && r2 == 0) {
                res = 0;
            } else if (r1 == 0) {
                res = r2;
            } else if (r2 == 0) {
                res = r1;
            } else {
                res = Math.min(r1, r2);
            }
            if (res == 0) {
                c++;
            }
            else{
                dq.addFirst(res);
            }
        }
        return dq.size()+c;
    }
}