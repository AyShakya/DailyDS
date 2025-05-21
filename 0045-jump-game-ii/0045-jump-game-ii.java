class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        if(n==1){
            return 0;
        }
        Queue<Integer> Q = new LinkedList<>();
        Q.offer(0);
        int status[] = new int[n];
        for(int i=0;i<n;i++){
            status[i]=-1;
        }
        status[0]=0;
        while(!Q.isEmpty()){
            int x = Q.poll();
            int moves = nums[x];
            for(int i=1;i<=moves;i++){
                int y=x+i;
                if(status[y]==-1){
                    status[y]=status[x]+1;
                    Q.offer(y);
                    if(y==n-1){
                        return status[n-1];
                    }
                }
            }
        }
        return -1;
    }
}