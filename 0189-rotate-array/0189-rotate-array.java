class Solution {
    public void rotate(int[] nums, int k) {
        
        int n = nums.length;
        int[] copyArr = Arrays.copyOfRange(nums,0,n);
        
        for (int i = 0; i < n; i++) {
            nums[(i + k) % n] = copyArr[i];
        }
    
    }
}