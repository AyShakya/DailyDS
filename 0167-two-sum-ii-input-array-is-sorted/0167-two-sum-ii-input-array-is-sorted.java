class Solution {
    private int binary(int[] num, int target){
        int left=0,right=num.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(num[mid]==target){
                return mid;
            }
            else{
                if(num[mid]>target){
                    right=mid-1;
                }
                else{
                    left=mid+1;
                }
            }
        }
        return -1;
    }
    public int[] twoSum(int[] numbers, int target) {
        for(int i=0;i<numbers.length;i++){
            int j=target-numbers[i];
            int x = binary(numbers,j);
            if(x==i){
                x++;
            }
            if(x==-1){
                continue;
            }
            else{
                return new int[] {i+1,x+1};
            }
        }
        return new int[] {-1,-1};
    }
}