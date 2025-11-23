class Solution {
    public int maxSumDivThree(int[] nums) {
        
        ArrayList<Integer> r1 = new ArrayList<>();
        ArrayList<Integer> r2 = new ArrayList<>();
        int sum = 0;
        for(int i : nums){
            if(i%3==1) r1.add(i);
            if(i%3==2) r2.add(i);
            sum+=i;
        }
        Collections.sort(r1);
        Collections.sort(r2);
        if(sum%3==1){
            if(r2.size()>=2 && r1.size()>=1){
                sum = sum - Math.min(r1.get(0), r2.get(0)+r2.get(1));
            }
            else if(r1.size()>=1){
                sum -= r1.get(0);
            }
            else if(r2.size()>=2){
                sum -= r2.get(0)+r2.get(1);
            }
            else{
                sum = 0;
            }
        }
        else if(sum%3==2){
            if(r2.size()>=1 && r1.size()>=2){
                sum = sum - Math.min(r2.get(0), r1.get(0)+r1.get(1));
            }
            else if(r1.size()>=2){
                sum -= r1.get(0) + r1.get(1);
            }
            else if(r2.size()>=1){
                sum -= r2.get(0);
            }
            else{
                sum = 0;
            }
        }
        return sum;
    }
}
