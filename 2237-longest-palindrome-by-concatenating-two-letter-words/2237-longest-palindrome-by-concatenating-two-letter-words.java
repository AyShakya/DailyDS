class Solution {
    public int longestPalindrome(String[] words) {
       Map<String, Integer> countMap = new HashMap<>();
        int length = 0;
        boolean usedCenter = false;
        for (String word : words) {
            countMap.put(word, countMap.getOrDefault(word, 0) + 1);
        }

        for (String word : countMap.keySet()) {
            String reversed = new StringBuilder(word).reverse().toString();
            int wordCount = countMap.get(word);
            if (word.equals(reversed)) {
                int pairs = wordCount / 2;
                length += pairs * 4;
                countMap.put(word, wordCount - pairs * 2);
                if (!usedCenter && countMap.get(word) > 0) {
                    length += 2;
                    usedCenter = true;
                    countMap.put(word, countMap.get(word) - 1);
                }
            }
            else if (countMap.containsKey(reversed)) {
                int revCount = countMap.get(reversed);
                int pairs = Math.min(wordCount, revCount);
                length += pairs * 4;
                countMap.put(word, wordCount - pairs);
                countMap.put(reversed, revCount - pairs);
            }
        }

        return length;
    }
}