class Solution {
    public boolean canReach(int[] arr, int start) {
        if(arr[start]==0){
            return true;
        }
        Queue<Integer> q = new LinkedList<>();
        int status[] = new int[arr.length];
        q.offer(start);
        status[start]=1;
        int move1=0, move2=0;
        while(!q.isEmpty()){
            int x = q.poll();
            if(x+arr[x]<arr.length){
                move1=x+arr[x];
                if(status[move1]!=1){
                status[move1]=1;
                q.offer(move1);
                if(arr[move1]==0){
                    return true;
                }
            }
            }
            
            if(x-arr[x]>=0){
                move2=x-arr[x];
                if(status[move2]!=1){
                status[move2]=1;
                q.offer(move2);
                if(arr[move2]==0){
                    return true;
                }
            }
            }
            
        }
        return false;
    }
}