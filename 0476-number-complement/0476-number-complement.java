class Solution {
    public int findComplement(int num) {
        String binary = Integer.toBinaryString(num);
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<binary.length();i++){
            if(binary.charAt(i)=='0'){
                sb.append('1');
            }
            else{
                sb.append('0');
            }
        }
        return Integer.parseInt(sb.toString(),2);
    }
}