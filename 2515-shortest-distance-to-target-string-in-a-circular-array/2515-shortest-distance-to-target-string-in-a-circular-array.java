class Solution {
    public int closestTarget(String[] words, String target, int si) {
        List<Integer> a = new ArrayList<>();
        int n = words.length;
        for(int i=0;i<n;i++){
            if(words[i].equals(target)){
                a.add(i);
            }
        }
        if(a.size()==0) return -1;
        int ans = Integer.MAX_VALUE;
        for(Integer i : a){
            int x = (i-si+n)%n;
            int y = (si-i+n)%n;
            ans = Math.min(ans, Math.min(x,y));
        }
        return ans;
    }
}