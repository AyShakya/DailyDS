class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, ArrayList<String>> m = new HashMap<>();
        for(String s : strs){
            char[] arr = s.toCharArray();   
            Arrays.sort(arr);               
            String sorted = new String(arr);
            m.computeIfAbsent(sorted, key -> new ArrayList<>()).add(s);
        }
        List<List<String>> res = new ArrayList<>();
        for(ArrayList<String> list : m.values()){
            res.add(list);
        }
        return res;
    }
}