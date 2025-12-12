class Solution {
    public int[] countMentions(int n, List<List<String>> events) {
        events.sort(
                Comparator
                        .comparingInt((List<String> e) -> Integer.parseInt(e.get(1)))
                        .thenComparingInt(e -> e.get(0).equals("OFFLINE") ? 0 : 1));

        int[] count = new int[n];
        int[] nextOnlineTime = new int[n];
        int all = 0;
        for (List<String> event : events) {
            int curTime = Integer.parseInt(event.get(1));
            String type = event.get(0);
            if (type.equals("MESSAGE")) {
                String target = event.get(2);
                String[] tokens = target.split(" ");
                for (String token : tokens) {
                    if (token.equals("ALL")) {
                        all++;
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
        if(all!=0){
            for(int i=0;i<n;i++){
                count[i]+=all;
            }
        }
        return count;
    }
}