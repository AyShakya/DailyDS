class Solution {
    public int snakesAndLadders(int[][] board) {
        int n = board.length;
        int jump[] = new int[n*n+1];
        Arrays.fill(jump, -1);
        int idx=1;
        Boolean leftToright = true;
        for(int i=n-1;i>=0;i--){
            if(leftToright){
                for(int j=0;j<n;j++){
                    jump[idx++]=board[i][j];
                }
                leftToright=false;
            }
            else{
                for(int j=n-1;j>=0;j--){
                    jump[idx++]=board[i][j];
                }
                leftToright=true;
            }
        }
        int status[] = new int[n*n+1];
        Arrays.fill(status, -1);
        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        status[1]=0;
        while(!q.isEmpty()){
            int x = q.poll();
            for(int i=1;i<=6;i++){
                int y=x+i;
                if(y>n*n){
                    continue;
                }
                int dest = (jump[y]==-1)?y:jump[y];
                if(status[dest]==-1){
                    status[dest]=status[x]+1;
                    if(dest==n*n){
                        return status[n*n];
                    }
                    q.offer(dest);
                }
            }
        }
        return -1;
    
    }
}