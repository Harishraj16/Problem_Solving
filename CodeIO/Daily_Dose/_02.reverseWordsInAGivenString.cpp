class Solution
{
    public:
    //Function to reverse words in a given string.
    string reverseWords(string S) 
    { 
        string res;
        string temp;
        stack<string> stk;
        for(int i=0;i<S.size();i++){
            if(S[i]!='.') temp+=S[i];
            else if(S[i]=='.'){
                stk.push(temp);
                stk.push(".");
                temp="";
            }
        }
        stk.push(temp);
        while(!stk.empty()){
            res+=stk.top();
            stk.pop();
        }
        return res;
    } 
};
