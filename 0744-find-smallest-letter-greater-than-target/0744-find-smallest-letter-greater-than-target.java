class Solution {
    private int binarySearch(char[] n, char x){
        int left=0,right=n.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(n[mid]==x){
                return mid;
            }
            else{
                if(n[mid]>x){
                    right=mid-1;
                }
                else{
                    left=mid+1;
                }
            }
        }
        return -1;
    }
    public char nextGreatestLetter(char[] letters, char target) {
        int x = binarySearch(letters,target);
        int n = letters.length;
        if(x!=-1){
            if(letters[n-1]==target){
                return letters[0];
            }
            while(x<n && letters[x+1]==target){
                x++;
            }
            return letters[x+1];
        }
        for(int i=0;i<n;i++){
            if(letters[i]>target){
                return letters[i];
            }
        }
        return letters[0];
    }
}