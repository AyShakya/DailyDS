class Solution {
    public int countSegments(String s) {
        int count=0,i=0;
        int n=s.length();
        while(i<n && s.charAt(i)==' '){
            i++;
        }
        while(i<n){
            while(i<n && s.charAt(i)==' '){
                i++;
            }
            if(i==n){
                break;
            }
            while(i<n && s.charAt(i)!=' '){
                i++;
            }
            count++;
        }
        return count;
    }
}