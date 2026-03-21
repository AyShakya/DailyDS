class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, ArrayList<String>> m = new HashMap<>();
        for(String s : strs){
            int[] a = new int[26];
            for(char ch : s.toCharArray()) a[ch-'a']++;
            StringBuilder sb = new StringBuilder();
            for(int i : a) sb.append(i).append('#');
            m.computeIfAbsent(sb.toString(), key -> new ArrayList<>()).add(s);
        }
        List<List<String>> res = new ArrayList<>();
        for(ArrayList<String> list : m.values()){
            res.add(list);
        }
        return res;
    }
}