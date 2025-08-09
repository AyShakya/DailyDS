class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i=0;i<asteroids.length;i++){
            if(asteroids[i]>0){
                stack.push(asteroids[i]);
            }else{
                while(!stack.isEmpty() && stack.peek()>0 && stack.peek()<Math.abs(asteroids[i])){
                    stack.pop();
                }if(stack.isEmpty() || stack.peek()<0){
                    stack.push(asteroids[i]);
                }else if(stack.peek()==Math.abs(asteroids[i])){
                    stack.pop();
                }
            }
        }
        int res[] = new int[stack.size()];
        int i=0;
        while(!stack.isEmpty()){
            res[res.length-1-i++]=stack.pop();
        }
        return res;
    }
}