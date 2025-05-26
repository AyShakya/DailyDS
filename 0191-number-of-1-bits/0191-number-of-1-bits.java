class Solution {
    public int hammingWeight(int n) {
        String value = Integer.toBinaryString(n);
        int count = 0;
        for(int i=0;i<value.length();i++){
            if(value.charAt(i)=='1'){
                count++;
            }
        }
        return count;
    }
}