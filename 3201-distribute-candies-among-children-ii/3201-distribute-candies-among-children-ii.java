class Three {
    int first, second, third;
    Three(int first, int second, int third){
        this.first=first;
        this.second=second;
        this.third=third;
    }
}
class Solution {
    public long distributeCandies(int n, int limit) {
        if(limit*3<n){
            return 0;
        }
        long total=0;
        int val = Math.min(n,limit);
        for(int i=0;i<=val;i++){
            int rem = n - i;
            int minJ = Math.max(0, rem - limit);
            int maxJ = Math.min(limit, rem);
            total += Math.max(0, maxJ - minJ + 1);
        }
        return total;
    }
}