class Solution {
    public int candy(int[] b) {
        int n = b.length;
        if(n==1){
            return 1;
        }
        int a[] = new int[n];
        Arrays.fill(a, 1);
        for(int i=0;i<n-1;i++){
            if(b[i+1]>b[i]){
                if(a[i+1]>a[i]){
                    continue;
                }
                else{
                    a[i+1]=a[i]+1;
                }
            }
        }
        for(int i=n-1;i>0;i--){
            if(b[i-1]>b[i]){
                if(a[i-1]>a[i]){
                    continue;
                }
                else{
                    a[i-1]=a[i]+1;
                }
            }
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=a[i];
        }
        return sum;
    }
}