class Solution {
    public boolean valid(int[] nums, int curr, int dir){
        int n = nums.length;
        int[] a = nums.clone();
        
        while(curr>=0 && curr<n){
            if (a[curr] == 0) {
                curr += (dir == 0) ? -1 : 1;
            } else { 
                a[curr]--;            
                dir = 1 - dir;        
                curr += (dir == 0) ? -1 : 1; 
            }
        }

        for(int i : a){
            if(i!=0){
                return false;
            }
        }
        return true;
    }

    public int countValidSelections(int[] nums) {
        int c = 0;
        for(int i = 0; i< nums.length; i++){
            if (nums[i] != 0) continue;
            if(valid(nums, i, 0)) c++;
            if(valid(nums, i, 1)) c++;
        }
        return c;
    }
}