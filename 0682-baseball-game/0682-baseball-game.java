class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<operations.length;i++){
            Character ch = operations[i].charAt(0);
            
            if(ch=='C'){
                s.pop();
            }
            else if(ch=='D'){
                int x=0;
                if(!s.isEmpty()){
                    x=s.peek();
                }
                else{
                    continue;
                }
                s.push(2*x);
            }
            else if(ch=='+'){
                int b=0,a=0;
                if(!s.isEmpty()){
                    a = s.pop();
                }
                else{
                    continue;
                }
                if(!s.isEmpty()){
                    b = s.peek();
                }
                else{
                    continue;
                }
                s.push(a);
                s.push(a+b);
            }
            else{
                s.push(Integer.parseInt(operations[i]));
            }
        }
        int sum=0;
        for(Integer i : s){
            sum+=i;
        }
        return sum;
    }
}