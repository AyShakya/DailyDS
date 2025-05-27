class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> count = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(count.containsKey(arr[i])){
                int val = count.get(arr[i]);
                arr[val]=" ";
                arr[i]=" ";
            }
            count.put(arr[i],i);
        }
        int j=0;
        for(j=0;j<arr.length;j++){
            if(arr[j]==" "){
                continue;
            }
            k--;
            if(k==0){
                break;
            }
        }
        if(k==0){
            return arr[j];
        }
        return "";
    }
}