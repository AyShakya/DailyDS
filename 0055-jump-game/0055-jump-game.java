class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        if(n==1){
            return true;
        }
        Queue<Integer> Q = new LinkedList<>();
        int status[] = new int[n];
        Q.offer(0);
        Arrays.fill(status, -1);
        status[0]=0;
        while(!Q.isEmpty()){
            int x = Q.poll();
            int moves = nums[x];
            for(int i=1;i<=moves;i++){
                int y = x+i;
                if(status[y]==-1){
                    status[y]=status[x]+1;
                    Q.offer(y);
                    if(y==n-1){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}