class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double maxD = 0;
        int maxA = 0;
        for(int q[] : dimensions){
            int a = q[0];
            int b = q[1];
            double D = Math.sqrt(a*a + b*b);
            if(maxD<D){
                maxD = D;
                maxA = a*b;
            }
            else if(maxD==D){
                maxA = Math.max(maxA, a*b);
            }
        }
        return maxA;
    }
}