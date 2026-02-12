class Solution {
    public int longestBalanced(String s) {
        int a[] = new int[26];
        int n = s.length();
        int ans = 0;
        for(int i=0;i<n;i++){
            if(ans>=n-i) break;
            Arrays.fill(a, 0);
            for(int j=i;j<n;j++){
                Character p = s.charAt(j);
                boolean f = true;
                a[p-'a']++;

                for(int x : a){
                    if(x>0 && x!=a[p-'a']){
                        f = false;
                        break;
                    }
                }

                if(f) ans = Math.max(ans, j-i+1);
            }
        }
        return ans;
    }
}

