class Solution{
public:	
		
	string removeVowels(string S) 
	{
	    int ind = 0;
	    for(int i=0;i<S.size();i++){
	        if(S[i]=='a' || S[i]=='e' || S[i]=='i' || S[i]=='o' || S[i]=='u') continue;
	        else S[ind++] = S[i];
	    }
	    S.resize(ind);
	    return S;
	}
};



class Solution
{
    public:
    string reverseWord(string str)
    {
        int i=0;
        int n = str.length();
        while(i<n/2){
            char temp = str[i];
            str[i] = str[n-i-1];
            str[n-1-i] = temp;
            i++;
        }
        return str;
    }
};
