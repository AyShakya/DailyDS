class Solution {
    private String devowel(String s) {
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if ("aeiouAEIOU".indexOf(ch) >= 0) {
                sb.append('*');
            } else {
                sb.append(Character.toLowerCase(ch)); 
            }
        }
        return sb.toString();
    }
    
    public String[] spellchecker(String[] wordlist, String[] queries) {
        Set<String> words = new HashSet<>(Arrays.asList(wordlist));
        Map<String, String> caseInsensitive = new HashMap<>();
        Map<String, String> vowelInsensitive = new HashMap<>();
        for (String word : wordlist) {
            String lower = word.toLowerCase();
            String dev = devowel(word);
            caseInsensitive.putIfAbsent(lower, word);
            vowelInsensitive.putIfAbsent(dev, word);
        }
        String[] ans = new String[queries.length];
        for (int i = 0; i < queries.length; i++) {
            String q = queries[i];
            if (words.contains(q)) {
                ans[i] = q;
                continue;
            }
            String lower = q.toLowerCase();
            if (caseInsensitive.containsKey(lower)) {
                ans[i] = caseInsensitive.get(lower);
                continue;
            }
            String dev = devowel(q);
            ans[i] = vowelInsensitive.getOrDefault(dev, "");
        }
        return ans;
    }
}