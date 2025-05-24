class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> cal = new ArrayList<>();
        int i=0,j=0;
        while(i<nums.length){
            while(i<nums.length-1 && nums[i]+1==nums[i+1]){
                i++;
            }   
            if(i==j){
                cal.add(String.valueOf(nums[i]));
            }
            else{
                String one = String.valueOf(nums[j]);
                String two = String.valueOf(nums[i]);
                cal.add(one+"->"+two);
            }
            i++;
            j=i;
        }  
        return cal;  
    }
}