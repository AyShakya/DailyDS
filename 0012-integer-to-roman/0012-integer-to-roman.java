class Solution {
    public String intToRoman(int num) {
        Map<Integer, String> roman = new HashMap<>();
        roman.put(1,"I");
        roman.put(4,"VI");
        roman.put(5,"V");
        roman.put(9,"XI");
        roman.put(10,"X");
        roman.put(40,"LX");
        roman.put(50,"L");
        roman.put(90,"CX");
        roman.put(100,"C");
        roman.put(400,"DC");
        roman.put(500,"D");
        roman.put(900,"MC");
        roman.put(1000,"M");
        String s = String.valueOf(num);
        StringBuilder sb = new StringBuilder();
        int count=0;
        for(int i=s.length()-1;i>=0;i--){
            int x = (s.charAt(i) - '0')*(int)Math.pow(10,count);
            if(roman.containsKey(x)){
                sb.append(roman.get(x));
            }
            else if(x>=1 && x<=3){
                for(int j=1;j<=x;j++){
                    sb.append('I');
                }
            }
            else if(x>5 && x<=8){
                for(int j=1;j<=x-5;j++){
                    sb.append('I');
                }
                sb.append('V');
            }
            else if(x>=10 && x<=30){
                for(int j=1;j<=x/10;j++){
                    sb.append('X');
                }
            }
            else if(x>50 && x<=80){
                for(int j=1;j<=((x/10)-5);j++){
                    sb.append('X');
                }
                sb.append('L');
            }
            else if(x>=100 && x<=300){
                for(int j=1;j<=x/100;j++){
                    sb.append('C');
                }
            }
            else if(x>500 && x<=800){
                for(int j=1;j<=(x/100)-5;j++){
                    sb.append('C');
                }
                sb.append('D');
            }
            else{
                for(int j=1;j<=(x/1000);j++){
                    sb.append('M');
                }
            }
            count++;
        }
        return sb.reverse().toString();
    }
}