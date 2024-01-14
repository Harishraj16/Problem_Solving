//{ Driver Code Starts
// Initial Template for C++

#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
// User function Template for C++

class Solution
{
    public:
    
    // Function to reverse first k elements of a queue.
    queue<int> modifyQueue(queue<int> q, int k) {
       stack<int> stk;
       for(int i=0;i<k;i++){
           stk.push(q.front());
           q.pop();
       }
       queue<int> res;
       
       for(int i=0;i<k;i++){
           res.push(stk.top());
           stk.pop();
       }
       int len = q.size();
       for(int i=0;i<len;i++){
           res.push(q.front());
           q.pop();
       }
       
       return res;
    }
};


//{ Driver Code Starts.

int main() {
    int t;
    cin >> t;
    while (t-- > 0) {
        int n, k;
        cin >> n >> k;
        queue<int> q;
        while (n-- > 0) {
            int a;
            cin >> a;
            q.push(a);
        }
        Solution ob;
        queue<int> ans = ob.modifyQueue(q, k);
        while (!ans.empty()) {
            int a = ans.front();
            ans.pop();
            cout << a << " ";
        }
        cout << endl;
    }
}
// } Driver Code Ends
