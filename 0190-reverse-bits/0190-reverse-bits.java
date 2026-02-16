class Solution {
    public int reverseBits(int n) {
        String s = String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0');
        StringBuilder sb = new StringBuilder(s);
        String res = sb.reverse().toString();
        int ans = Integer.parseInt(res, 2);
        return ans;
    }
}