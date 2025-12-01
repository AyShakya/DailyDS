class Solution {
    public long maxRunTime(int n, int[] bat) {
        long extra = 0;
        int m = bat.length;
        Arrays.sort(bat);
        for(int i=0;i<m-n;i++){
            extra+=(long)bat[i];
        }
        int arr[] = new int[n];
        int j = 0;
        for(int i=m-n;i<m;i++){
            arr[j] = bat[i];
            j++;
        }
        for(int i=0;i<n-1;i++){
            long val = (i+1)*(arr[i+1]-arr[i]);
            if(extra < val){
                return arr[i] + extra/(i+1);
            }
            extra -= val;
        }
        return arr[n-1] + extra/n;
    }
}