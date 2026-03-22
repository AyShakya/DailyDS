class Solution {
    public int eraseOverlapIntervals(int[][] in) {
        int c = 1;
        int n = in.length;
        Arrays.sort(in, (a,b) -> Integer.compare(a[1], b[1]));
        int last = in[0][1];
        for(int i=1;i<n;i++){
            if(in[i][0]>=last){
                c++;
                last = in[i][1];
            }
        }
        return n-c;
    }
}