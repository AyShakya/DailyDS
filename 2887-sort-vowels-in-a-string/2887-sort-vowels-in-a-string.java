class Solution {
    public String sortVowels(String s) {
        HashSet<Character> vowels = new HashSet<>(
            Arrays.asList('A','E','I','O','U','a','e','i','o','u')
        );
        List<Character> vowelList = new ArrayList<>();
        StringBuilder sb = new StringBuilder(s);
        int n = sb.length();
        for(int i=0;i<n;i++){
            char c = sb.charAt(i);
            if(vowels.contains(c)){
                vowelList.add(c);
            }
        }
        Collections.sort(vowelList);
        int idx=0;
        for(int i=0;i<n;i++){
            char c = sb.charAt(i);
            if(vowels.contains(c)){
                sb.setCharAt(i, vowelList.get(idx++));
            }
        }
        return sb.toString();
    }
}