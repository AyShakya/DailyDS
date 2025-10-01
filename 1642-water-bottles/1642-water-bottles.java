class Solution {
    public int count(int n1, int n2, int emp) {
        int sum = n1;
        if((n1+emp)/n2 > 0){
            sum += count((n1+emp)/n2, n2, (n1+emp)%n2);
        }
        return sum;
    }
    public int numWaterBottles(int n1, int n2) {
        return count(n1,n2,0);
    }
}