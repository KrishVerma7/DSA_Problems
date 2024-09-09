class Solution {
    public int findDuplicate(int[] arr) {
        int i = 0;
        while(i<arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else{
                i++; 
            }
        }
        
        for(int j = 0; j<arr.length; j++){
            if(arr[j] != j+1){
                return arr[j];
            }
        }
        return 0;
    }
    
    
    void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}