class Solution {
    // private boolean binarySeach(int[] arr, int target){
    //     int left=0, right=arr.length-1;
    //     while(left<=right){
    //         int mid = (left+right)/2;
    //         if(arr[mid]==target){
    //             return true;
    //         }
    //         else{
    //             if(arr[mid]>target){
    //                 right=mid-1;
    //             }
    //             else{
    //                 left=mid+1;
    //             }
    //         }
    //     }
    //     return false;
    // }
    public int[] fairCandySwap(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
        int alice=0, bob=0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : a){
            alice+=i;
        }
        for(int i : b){
            bob+=i;
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        // for(int k=1;k<=diff;k++){
        //     int i = k;
        //     int j = (bob-alice+2*i)/2;
        //     if(binarySeach(a,i) && binarySeach(b,j)){
        //         res[0]=i;
        //         res[1]=j;
        //         break;
        //     }
        // }
        for(int i : a){
            int j = (bob - alice +2*i)/2;
            if(map.containsKey(j)){
                return new int[] {i,j};
            }
        }
        return new int[] {0,0};
    }
}