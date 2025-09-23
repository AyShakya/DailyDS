class Solution {
    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        int i=0, j=0;
        int n = v1.length;
        int m = v2.length;
        while(i<n && j<m){
            int k1 = Integer.parseInt(v1[i]);
            int k2 = Integer.parseInt(v2[j]);
            if(k1==k2){
                i++;
                j++;
            }
            else if(k1>k2){
                return 1;
            }
            else if(k1<k2){
                return -1;
            }
        }
        while(i<n){
            int k1 = Integer.parseInt(v1[i]);
            if(k1!=0){
                return 1;
            }
            i++;
        }
        while(j<m){
            int k2 = Integer.parseInt(v2[j]);
            if(k2!=0){
                return -1;
            }
            j++;
        }
        return 0;
    }
}