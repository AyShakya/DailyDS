class Solution {
    public int[][] merge(int[][] nums) {
        Arrays.sort(nums, (a, b) -> Integer.compare(a[0], b[0]));
        ArrayList<int[]> ans = new ArrayList<>();  
        int n = nums.length;
        int[] trial = nums[0];
        int j=0;
        ans.add(trial);
        for(int i=1;i<n;i++){
            if(nums[i][0]<= trial[1]){
                ans.get(j)[1]=Math.max(ans.get(j)[1], nums[i][1]);
            }
            else{
                ans.add(nums[i]);
                trial=nums[i];
            }
        }
        int[][] ansnew = ans.toArray(new int[ans.size()][]);
        return ansnew;
    }
}