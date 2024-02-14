class Solution{
public:
	
	int findMaximum(int arr[], int n) {
	    int res=arr[n-1];
	    for(int  i=0;i<n-1;i++){
	        if(arr[i+1]<arr[i]){
	            res=arr[i];
	            break;
	        }
	    }
	    return res;
	}
};
