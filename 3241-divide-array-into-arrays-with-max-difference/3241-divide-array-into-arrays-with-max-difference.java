class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int[][] res = new int[n/3][3];
        int p=0;
        for(int i=0;i<res.length;i++){
            for(int j=0;j<res[0].length;j++){
                res[i][j]=nums[p];
                p++;
            }
        }
        for(int i=0;i<res.length;i++){
            for(int j=0;j<res[0].length;j++){
                if(j<2 && res[i][j+1]-res[i][j]>k){
                    return new int[][] {};
                }
                if(j<1 && res[i][j+2]-res[i][j]>k){
                    return new int[][] {};
                }
            }
        }
        return res;
    }
}