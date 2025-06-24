class Solution {
    public String reverseWords(String s) {
        if(s.equals(null) || s.equals("")){
            return s;
        }
        String ret = "";
        int n = s.length();
        int i=0;
        while(i<n){
            while(i<n && s.charAt(i)==' '){
                i++;
            }
            String w = "" ;
            while(i<n && s.charAt(i)!=' '){
                w += s.charAt(i);
                i++;
            }
            if(!w.equals("")) ret = w + " " + ret;
        }
        if(ret.isEmpty()){
            return "";
        }
        return ret.substring(0,ret.length()-1);
    }
}