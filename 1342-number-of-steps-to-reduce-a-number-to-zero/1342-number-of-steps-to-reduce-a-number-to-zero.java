class Solution {
    public int numberOfSteps(int num) {
        return ans(num,0);
    }
    
    public int ans(int num, int steps){
        if(num == 0) return steps;
        
        if(num%2 == 0){
            num = num/2;
        }else{
            num = num - 1;
        }
        steps += 1;
        
        return ans(num,steps);
    }
}