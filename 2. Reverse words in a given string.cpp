//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends

class Solution
{
    public:
    //Function to reverse words in a given string.
    string reverseWords(string S) 
    { 
        stack<string> words;
        string a="";
        for(int i=0;S[i]!='\0';i++){
            if(S[i]=='.'){
                words.push(a);
                a="";
            }
            else{
                a += S[i];
            }
        }
        words.push(a);
        
        string res = words.top();
        words.pop();
        
        while(!words.empty()){
            res += '.';
            res += words.top();
            words.pop();
        }
        
        return res;
    } 
};

//{ Driver Code Starts.
int main() 
{
    int t;
    cin >> t;
    while (t--) 
    {
        string s;
        cin >> s;
        Solution obj;
        cout<<obj.reverseWords(s)<<endl;
    }
}
// } Driver Code Ends
