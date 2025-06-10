class Solution {
    public int[] constructRectangle(int area) {
        int A[] = new int[2];
        if(area==1){
            A[0]=1;
            A[1]=1;
            return A;
        }
        int minlen = Integer.MAX_VALUE, L=0, W=0;
        for(int i=1;i<=area/2;i++){
            if(area%i==0){
                int a=area/i;
                int b=i;
                int dif = Math.abs(a-b);
                if(dif<minlen){
                    minlen=dif;
                    L=a>b?a:b;
                    W=a<b?a:b;
                }
            }
        }
        A[0]=L;
        A[1]=W;
        return A;
    }
}