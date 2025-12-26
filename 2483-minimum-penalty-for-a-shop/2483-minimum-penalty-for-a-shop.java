class Solution {
    public int bestClosingTime(String customers) {
        int p = 0;
        int n = customers.length();
        for (char c : customers.toCharArray()) {
            if (c == 'Y') p++;
        }
        int minPenalty = p;
        int bestHour = 0;
        for (int i = 0; i < n; i++) {
            if (customers.charAt(i) == 'Y') {
                p--; 
            } else {
                p++; 
            }
            if (p < minPenalty) {
                minPenalty = p;
                bestHour = i + 1;
            }
        }
        return bestHour;
    }
}