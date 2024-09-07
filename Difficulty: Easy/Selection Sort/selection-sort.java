//{ Driver Code Starts
import java.util.*;

class GFG
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n]; 
			for(int i=0;i<n;i++)
			{
				arr[i] = sc.nextInt();
			}
		
			Solution obj = new Solution();
			obj.selectionSort(arr, n);
			
			for(int i=0;i<n;i++)
		    	System.out.print(arr[i]+" ");
		    System.out.println();
			t--;
		}
		
	}
}

// } Driver Code Ends


class Solution
{
	int  select(int arr[], int start, int lastIndex)
	{
        // code here such that selectionSort() sorts arr[]
        int max= start;
        
        for(int i = start;i<=lastIndex; i++){
            if(arr[i]>arr[max]){
                max=i;
            }
        }
        return max;
        
	}
	
	void selectionSort(int arr[], int n)
	{
	    //code here
	    for(int i = 0; i<arr.length;i++){
	        int lastIndex = arr.length-i-1;
	        int maxIndex = select(arr,0,lastIndex);
	        
	        int temp = arr[maxIndex];
	        arr[maxIndex] = arr[lastIndex];
	        arr[lastIndex] = temp;
	    }
	}
}