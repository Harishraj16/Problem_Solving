class Solution{
  public:
    int findExtra(int a[], int b[], int n) {
        for(int i=0;i<n;i++){
            if(a[i]!=b[i]) return i;
        }
        return -1;
    }
};

//Optimal Way:
class Solution{
  public:
    int findExtra(int a[], int b[], int n) {
        int start = 0;
        int end = n-1;
        int mid,index;   //int mid is important initialize outside the loop.
        while(start<=end){
            mid = start + (end-start)/2;
            if(a[mid]==b[mid]) start = mid+1;
            else{
                index = mid;
                end = mid-1;
            }
        }
        return index;
    }
};
