class Solution {
    public String convert(String s, int n) {
        int m=s.length();
        if(n==1 || n==m){
            return s;
        }
        StringBuilder sb = new StringBuilder();
        List<StringBuilder> rows = new ArrayList<>();
        for(int i=0;i<n;i++){
            rows.add(new StringBuilder());
        }
        int curr = 0;
        Boolean going = false;
        for(char c : s.toCharArray()){
            rows.get(curr).append(c);
            if(curr==0 || curr==n-1){
                going = !going;
            }

            curr += going? 1:-1;
        }

        for(StringBuilder r : rows){
            sb.append(r);
        }
        return sb.toString();
    }
}