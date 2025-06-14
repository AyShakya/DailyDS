class Solution {
    public int minMaxDifference(int num) {
        String s = String.valueOf(num);
        int n1=9, n2=0;
        for(int i=0;i<s.length();i++){
            if(n1==9 && s.charAt(i)!='9'){
                n1=s.charAt(i) - '0';
            }
            if(n2==0 && s.charAt(i)!='0'){
                n2=s.charAt(i) - '0';
            }
        }
        int rem=0;
        StringBuilder res = new StringBuilder();
        while(num!=0){
            int a = num%10;
            int b = num%10;
            if(n1==a) a=9;
            if(n2==b) b=0;

            int k = a-b-rem;
            if(k<0){
                k=10-k;
                rem=-1;
            }
            else{
                rem=0;
            }

            res.append(k);
            num/=10;
        }
        return Integer.valueOf(res.reverse().toString());
    }
}