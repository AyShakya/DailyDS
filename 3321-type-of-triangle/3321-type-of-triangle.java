class Solution {
    public String triangleType(int[] nums) {
        if(nums[0]+nums[1]>nums[2] && nums[1]+nums[2]>nums[0] && nums[2]+nums[0]>nums[1]){
            if(nums[0]==nums[1] && nums[1]==nums[2] && nums[2]==nums[0]){
                String sb1 = "equilateral";
                return sb1;
            }
            else if(nums[0]==nums[1] || nums[1]==nums[2] || nums[2]==nums[0]){
                String sb2 = "isosceles";
                return sb2;
            }
            else{
                String sb3 = "scalene";
                return sb3;
            }
        }
        else{
            String sb4 = "none";
            return sb4;
        }
    }
}