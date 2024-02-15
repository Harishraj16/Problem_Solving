class Solution
{   
    public:
    //Function to return list of integers visited in snake pattern in matrix.
    vector<int> snakePattern(vector<vector<int> > matrix)
    {   
        vector<int> res;
        int n = matrix.size();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i%2==0){
                    res.push_back(matrix[i][j]);
                }
                else{
                    res.push_back(matrix[i][(n-1)-j]);
                }
            }
        }
        return res;
    }
};
