class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int j=0,n=fruits.length,count=0;
        for(int i=0;i<n;i++){
            while(j<n && baskets[j]<fruits[i]){
                j++;
            }
            if(j<n && baskets[j]>=fruits[i] && baskets[j]!=-1){
                count++;
                baskets[j]=-1;
            }
            j=0;
        }
        return n-count;
    }
}