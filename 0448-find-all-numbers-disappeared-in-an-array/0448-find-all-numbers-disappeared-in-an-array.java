class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
        int i = 0;
        ArrayList<Integer> ans = new ArrayList<Integer>();
        while(i< arr.length){
            int correct = arr[i]-1;
            if(arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
        
        for(int j=0; j<arr.length; j++){
            if(arr[j] != j+1){
                ans.add(j+1);
            }
        }
        return ans;
    }
    
    void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}