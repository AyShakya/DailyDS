class Solution {
    public String licenseKeyFormatting(String s, int k) {
        String cleaned = s.replaceAll("-", "").toUpperCase();
        StringBuilder sb = new StringBuilder();
        int len = cleaned.length();
        
        for (int i = 0; i < len; i++) {
            if (i > 0 && (len - i) % k == 0) {
                sb.append('-');
            }
            sb.append(cleaned.charAt(i));
        }
        return sb.toString();
    }
}