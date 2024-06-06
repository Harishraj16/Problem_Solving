class Solution
{
  public:
    int countPairs(int arr[], int arr1[],  int m, int n, int x) 
    { 
        int count = 0;
        set<int> s;
        for(int i=0;i<n;i++){
            s.insert(arr1[i]);
        }
        for(int i=0;i<m;i++){
            int rem = x-arr[i];
            if(s.find(rem)!=s.end()) count++;
        }
        return count;
    } 
};
