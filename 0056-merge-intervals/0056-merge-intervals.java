class Solution {
    public int[][] merge(int[][] nums) {
        Arrays.sort(nums, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> list = new ArrayList<>();
for (int[] interval : nums) {
    list.add(interval);
}
        int i=0,j=1,n=nums.length;
        while(j<n){
            int[] a = list.get(i);
            int[] b = list.get(j);
            if(a[1]>=b[0]){
                list.remove(j);
                list.get(i)[1]=Math.max(a[1],b[1]);
                n--;
            }
            else{
                i++;
                j++;
            }
        }
        int[][] ans = list.toArray(new int[list.size()][]);
        return ans;
    }
}