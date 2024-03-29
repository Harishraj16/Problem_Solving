//242. Valid Anagram

class Solution {
public:
    bool isAnagram(string s, string t) {
        std::unordered_map<char,int> smap;
        std::unordered_map<char,int> tmap;

        if(s.size() != t.size())
        {
            return false;
        }

        for(int i = 0; i < s.size(); i++){
            tmap[t[i]]++;
            smap[s[i]]++;
        }

        for(int i =0; i < smap.size(); i++)
        {
            if(smap[i] != tmap[i])
            {
                return false;
            }
        }
        return true;
    }
};
