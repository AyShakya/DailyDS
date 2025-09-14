class Solution {
    private String devowel(String s) {
        return s.toLowerCase().replaceAll("[aeiou]", "*");
    }
    
    public String[] spellchecker(String[] wordlist, String[] queries) {
        Set<String> words = new HashSet<>(Arrays.asList(wordlist));
        Map<String, String> caseInsensitive = new HashMap<>();
        Map<String, String> vowelInsensitive = new HashMap<>();
        for (String word : wordlist) {
            caseInsensitive.putIfAbsent(word.toLowerCase(), word);
            vowelInsensitive.putIfAbsent(devowel(word), word);
        }
        String[] ans = new String[queries.length];
        for (int i = 0; i < queries.length; i++) {
            String q = queries[i];   
            if (words.contains(q)) {
                ans[i] = q;  
            } else if (caseInsensitive.containsKey(q.toLowerCase())) {
                ans[i] = caseInsensitive.get(q.toLowerCase()); 
            } else if (vowelInsensitive.containsKey(devowel(q))) {
                ans[i] = vowelInsensitive.get(devowel(q));
            } else {
                ans[i] = "";
            }
        }
        return ans;
    }
}