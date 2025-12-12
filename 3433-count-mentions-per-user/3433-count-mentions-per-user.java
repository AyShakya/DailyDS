class Solution {
    public int[] countMentions(int n, List<List<String>> events) {
        events.sort((a, b) -> {
            int timeA = Integer.parseInt(a.get(1));
            int timeB = Integer.parseInt(b.get(1));
            if (timeA != timeB) {
                return Integer.compare(timeA, timeB);
            }
            boolean aIsMessage = a.get(0).equals("MESSAGE");
            boolean bIsMessage = b.get(0).equals("MESSAGE");
            return Boolean.compare(aIsMessage, bIsMessage);
        });

        int[] count = new int[n];
        int[] nextOnlineTime = new int[n]; 
        for (List<String> event : events) {
            int curTime = Integer.parseInt(event.get(1));
            String type = event.get(0);
            if (type.equals("MESSAGE")) {
                String target = event.get(2);
                String[] tokens = target.split(" ");
                for (String token : tokens) {
                    if (token.equals("ALL")) {
                        for (int i = 0; i < n; i++) {
                            count[i]++;
                        }
                    } else if (token.equals("HERE")) {
                        for (int i = 0; i < n; i++) {
                            if (nextOnlineTime[i] <= curTime) {
                                count[i]++;
                            }
                        }
                    } else if (token.startsWith("id")) {
                        int idx = Integer.parseInt(token.substring(2));
                        count[idx]++;
                    }
                }
            } else { 
                int idx = Integer.parseInt(event.get(2));
                nextOnlineTime[idx] = curTime + 60;
            }
        }
        return count;
    }
}