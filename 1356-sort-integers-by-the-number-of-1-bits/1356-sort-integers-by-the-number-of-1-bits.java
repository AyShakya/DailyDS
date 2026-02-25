class Solution {
    public int[] sortByBits(int[] arr) {
        int a[][] = new int[arr.length][2];
        for(int i=0;i<arr.length;i++){
            int k = Integer.bitCount(arr[i]);
            a[i][0] = k; 
            a[i][1] = arr[i]; 
        }
        Arrays.sort(a, (c,b) -> {
            if(c[0] !=b[0]){
                return Integer.compare(c[0], b[0]);
            }
            else{
                return Integer.compare(c[1], b[1]);
            }
        });
        for(int i=0;i<arr.length;i++){
            arr[i] = a[i][1];
        }
        return arr;
    }
}