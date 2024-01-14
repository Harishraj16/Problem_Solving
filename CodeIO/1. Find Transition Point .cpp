//Time complexity: O(logN)

//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
class Solution
{
public:    
    
    int transitionPoint(int arr[], int n) {
        int res = -1;
        int first = 0, last = n-1;
        if(n==1 && arr[0]==0) return -1;
        while(first<=last){
            int mid = first+(last-first)/2;
            if(arr[mid]==1 && arr[mid-1]==0) return mid;
            else if(arr[mid]==0){
                first = mid+1;
            }else{
                last = mid-1;
            }
        }
        return -1;
    }
};

//{ Driver Code Starts.
int transitionPoint(int arr[], int n);

int main() {
    int t;
    cin >> t;
    while (t--) {
        int n;
        cin >> n;
        int a[n], i;
        for (i = 0; i < n; i++) {
            cin >> a[i];
        }
        Solution ob;
        cout << ob.transitionPoint(a, n) << endl;
    }
    return 0;
}
// } Driver Code Ends
