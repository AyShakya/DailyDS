class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five=0;
        int ten=0;
        int curr=0;
        for(int i : bills){
            curr = i-5;
            if(curr==0){
                five++;
                continue;
            }
            else if(curr==5){
                if(five>0){
                    five--;
                    ten++;
                    continue;
                }
                else return false;
            }
            else{
                if(five>0 && ten>0){
                    five--;
                    ten--;
                    continue;
                }
                else if(five>=3){
                    five-=3;
                    continue;
                }
                else return false;
            }
        }
        return true;
    }
}