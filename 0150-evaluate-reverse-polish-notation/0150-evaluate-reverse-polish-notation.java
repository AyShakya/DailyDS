class Solution {
    private int findValue(int a, int b, String s){
        switch(s){
            case "+" : return a+b;
            case "-" : return a-b;
            case "*" : return a*b;
            case "/" : return a/b;
        }
        return 0;
    }
    public int evalRPN(String[] tokens) {
        Stack<Integer> cal = new Stack<>();
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("+") || tokens[i].equals("-") || 
               tokens[i].equals("*") || tokens[i].equals("/")){
                int b = cal.pop(); 
                int a = cal.pop();
                cal.push(findValue(a,b,tokens[i]));
            }
            else{
                cal.push(Integer.parseInt(tokens[i]));
            }
        }
        return cal.pop();
    }
}