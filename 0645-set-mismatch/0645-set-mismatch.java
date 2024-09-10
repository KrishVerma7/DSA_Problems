class Solution {
    public int[] findErrorNums(int[] nums) {
        int i = 0;
        while(i<nums.length){
            int correct = nums[i] -1;
            if(nums[i] != nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
        int[] ans = new int[2];
        for(int j=0;j<nums.length; j++){
            if(nums[j] != j+1){
                ans[0] = nums[j];
                ans[1] = j+1;
            }
        }
        return ans;
    }
    
    void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}