class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        List<String> el = new ArrayList<>();
        List<String> gr = new ArrayList<>();
        List<String> ph = new ArrayList<>();
        List<String> re = new ArrayList<>();
        int n = code.length;
        for (int i = 0; i < n; i++) {
            String c = code[i];
            boolean f = false;
            if (!isActive[i] || c.length()==0)
                continue;
            for (char ch : c.toCharArray()) {
                if (Character.isLetterOrDigit(ch) || ch == '_') {
                    continue;
                } else {
                    f = true;
                    break;
                }
            }
            if (f) {
                continue;
            }
            String s = businessLine[i];
            if (s.equals("electronics")) {
                el.add(code[i]);
            } else if (s.equals("grocery")) {
                gr.add(code[i]);
            } else if (s.equals("pharmacy")) {
                ph.add(code[i]);
            } else if (s.equals("restaurant")) {
                re.add(code[i]);
            }
        }
        Collections.sort(el);
        Collections.sort(gr);
        Collections.sort(ph);
        Collections.sort(re);
        el.addAll(gr);
        el.addAll(ph);
        el.addAll(re);
        return el;
    }
}