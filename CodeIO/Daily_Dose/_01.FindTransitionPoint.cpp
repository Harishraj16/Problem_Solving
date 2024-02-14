class Solution
{
public:    
    
    int transitionPoint(int arr[], int n) {
        for(int i=0;i<n;i++){
            if(arr[i]==1) return i;
        }
        return -1;
    }
};

//Optimal Code:
class Solution
{
public:    
    
    int transitionPoint(int arr[], int n) {
        int start = 0;
        int end = n-1;
        int res=-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==1){
                end = mid-1;
                res = mid;
            }
            else start=mid+1;
        }
        return res;
    }
};
