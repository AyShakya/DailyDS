class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> res = new ArrayList<>();
        int i=0,j=0,n=nums.length;
        if(n==1){
            if(nums[0]==key){
                res.add(0);
            }
            return res;
        }
        while(i<n){
            while(j<n && nums[j]!=key){
                j++;
            }
            if(j==n){
                break;
            }
            if(i<j){
                if(Math.abs(i-j)<=k){
                    res.add(i);
                }
                i++;
            }
            else if(i==j){
                res.add(i);
                i++;
            }
            else{
                if(Math.abs(i-j)<=k){
                    res.add(i);
                    i++;
                }
                else{
                    j++;
                }
            }
        }
        return res;
    }
}