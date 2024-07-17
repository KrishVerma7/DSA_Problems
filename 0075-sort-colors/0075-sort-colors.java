class Solution {
    public void sortColors(int[] nums) {
        int left =0,mid=0,right=nums.length-1;
        int temp;
        for(int i=0;i<nums.length;i++){
            if(nums[mid]==0){
                temp=nums[left];
                nums[left]=nums[mid];
                nums[mid]=temp;
                left++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else if(nums[mid]==2){
                temp=nums[mid];
                nums[mid]=nums[right];
                nums[right]=temp;
                right--;
            }
        }
    }

}