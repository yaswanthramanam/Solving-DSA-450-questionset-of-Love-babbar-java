class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    int maxSubarraySum(int arr[], int n){
        
        int maxend=0;
        int maxsofar=0;
        for(int i=0;i<n;i++){
            maxend=maxend+arr[i];
            if(maxend<arr[i]){
                maxend=arr[i];
            }
            if(maxsofar<maxend){
                maxsofar=maxend;
            }
        }
        return maxsofar;
        
    }
    
}

