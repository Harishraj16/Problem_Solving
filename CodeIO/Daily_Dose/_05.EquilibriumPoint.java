class Solution {

    
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long a[], int n) {
        long lsum=0,rsum=0;
        int res = -1;
        for(int i=0;i<n;i++){
            lsum+=a[i];
        }
        for(int i=n-1;i>=0;i--){
            lsum -= a[i];
            if(rsum == lsum){
                res = i+1;
                return res;
            }
            rsum +=a[i];
        }
        return -1;
    }
}
