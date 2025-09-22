class Solution {
    public int maxFrequencyElements(int[] nums) {
        int []q = new int[100];
        for(int num : nums){
            q[num]++;
        }
        int sum=0,maxi=0;
        for(int num : q){
            maxi=Math.max(num, maxi);
        }
        for(int num : q){
            if(num==maxi){
                sum+=num;
            }
        }
        return sum;
    }
}