class Solution {
    public String sortVowels(String s) {
        ArrayList<Integer> al = new ArrayList<>();
        StringBuilder sb = new StringBuilder(s);
        Set<Character> set = new HashSet<>();
        set.add('A');
        set.add('E');
        set.add('O');
        set.add('I');
        set.add('U');
        set.add('a');
        set.add('e');
        set.add('o');
        set.add('i');
        set.add('u');
        int n = sb.length();
        for(int i=0;i<n;i++){
            if(set.contains(sb.charAt(i))){
                al.add((int)sb.charAt(i));
                sb.setCharAt(i, '0');
            }
        }
        Collections.sort(al);
        for(int i=0;i<n;i++){
            if(sb.charAt(i) == '0'){
                sb.setCharAt(i, (char)(int)al.get(0));
                al.remove(0);
            }
        }
        return sb.toString();
    }
}