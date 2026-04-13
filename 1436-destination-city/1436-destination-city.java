class Solution {
    public String destCity(List<List<String>> paths) {
        Set<String> s = new HashSet<>();
        for(List<String> i : paths){
            s.add(i.get(0));
        }
        for(List<String> i : paths){
            if(s.add(i.get(1))){
                return i.get(1);
            }
        }
        return "";
    }
}