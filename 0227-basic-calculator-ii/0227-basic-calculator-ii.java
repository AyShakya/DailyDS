class Solution {
    public int calculate(String s) {
        Deque<Integer> dq = new ArrayDeque<>();
        int n = s.length();
        int num = 0;
        char operation = '+';
        for(int i=0;i<n;i++){
            char currentChar = s.charAt(i);
            if(Character.isDigit(currentChar)){
                num = (num*10) + (currentChar - '0');
            }
            if((!Character.isDigit(currentChar) && currentChar!=' ') || i==n-1){
                if(operation == '-'){
                    dq.push(-num);
                }
                else if(operation == '+'){
                    dq.push(num);
                }
                else if(operation == '*'){
                    int stop = dq.peek();
                    dq.pop();
                    dq.push(stop*num);
                }
                else if(operation == '/'){
                    int stop = dq.peek();
                    dq.pop();
                    dq.push(stop/num);
                }
                operation = currentChar;
                num=0;
            }
        }
        int res = 0;
        while(!dq.isEmpty()){
            res += dq.pop();
        }
        return res;
    }
}