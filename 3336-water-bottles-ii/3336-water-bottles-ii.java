class Solution {
    public int maxBottlesDrunk(int x, int y) {
        int emp = 0, dr=0;
        while((x+emp)>=y){
            dr+=x;
            emp+=x;
            x=0;
            emp=emp-y;
            x++;
            y++;
        }
        if(x>0){
            dr+=x;
        }
        return dr;
    }
}