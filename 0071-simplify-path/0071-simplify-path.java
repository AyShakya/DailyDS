class Solution {
    public String simplifyPath(String path) {
        String[] part = path.split("/");
        Stack<String> s = new Stack<>();
        for(String p : part){
            if(p.equals(".") || p.equals("")){
                continue;
            }
            else if(p.equals("..")){
                if(!s.isEmpty()){
                    s.pop();
                }
            }
            else{
                s.push(p);
            }
        }
        StringBuilder sbnew = new StringBuilder();
        for(String so : s){
            sbnew.append("/").append(so);
        }
        return sbnew.length() > 0 ? sbnew.toString() : "/";
    }
}