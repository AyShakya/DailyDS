class Solution {
    public String addStrings(String num1, String num2) {
        int i=num1.length()-1,j=num2.length()-1,carry=0;
        StringBuilder sb = new StringBuilder();
        while(i>=0 && j>=0){
            int sum = ((num1.charAt(i)-'0')+(num2.charAt(j)-'0')+carry);
            carry=0;
            if(sum>=10){
                sum=sum%10;
                carry=1;
            }
            sb.append((char)(sum+'0'));
            i--;
            j--;
        }
        while(i>=0){
            int sum = (num1.charAt(i)-'0')+carry;
            carry=0;
            if(sum>=10){
                sum=sum%10;
                carry=1;
            }
            sb.append((char)(sum+'0'));
            i--;
        }
        while(j>=0){
            int sum = (num2.charAt(j)-'0')+carry;
            carry=0;
            if(sum>=10){
                sum=sum%10;
                carry=1;
            }
            sb.append((char)(sum+'0'));
            j--;
        }
        if(carry==1){
            sb.append('1');
        }
        return sb.reverse().toString();
        
    }
}