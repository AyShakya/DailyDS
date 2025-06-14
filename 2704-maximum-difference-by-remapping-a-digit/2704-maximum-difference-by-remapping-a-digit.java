class Solution {
    public int minMaxDifference(int num) {
        int[] digits = String.valueOf(num).chars().map(c -> c-'0').toArray();
        int[] max = Arrays.copyOf(digits, digits.length);
        int[] min = Arrays.copyOf(digits, digits.length);
        int digmax=-1,digmin=-1,res=0,nmin=0,nmax=0, n = digits.length;
        for(int i=0;i<n;i++){
            if(digits[i]==9){
                continue;
            }
            else{
                digmax=digits[i];
                break;
            }
        }
        if(digmax==-1){
            digmax=9;
        }
        for(int i=0;i<n;i++){
            if(digits[i]==0){
                continue;
            }
            else{
                digmin=digits[i];
                break;
            }
        }
        if(digmin==-1){
            digmin=0;
        }
        for(int i=0;i<n;i++){
            if(max[i]==digmax){
                max[i]=9;
            }
        }       
        for(int i=0;i<n;i++){
            if(min[i]==digmin){
                min[i]=0;
            }
        }
        for(int i=0;i<n;i++){
            nmin=nmin*10 + min[i];
        }
        for(int i=0;i<n;i++){
            nmax=nmax*10 + max[i];
        }
        return nmax-nmin;
    }
}