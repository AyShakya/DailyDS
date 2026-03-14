class Solution {
    public String getHappyString(int n, int k) {
        List<String> result = new ArrayList<>();
        generateHappyStrings(n, new StringBuilder(), result);
        return k <= result.size() ? result.get(k - 1) : "";
    }
    private static void generateHappyStrings(int n, StringBuilder sb, List<String> result) {
        if (sb.length() == n) {
            result.add(sb.toString());
            return;
        }
        for (char ch : new char[]{'a', 'b', 'c'}) {
            if (sb.length() == 0 || sb.charAt(sb.length() - 1) != ch) {
                sb.append(ch);
                generateHappyStrings(n, sb, result);
                sb.deleteCharAt(sb.length() - 1);
            }
        }
    }
}