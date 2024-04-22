class Solution {
  public:
    long long lcm(long long A, long long B){
        return (A*B)/gcd(A,B);
    }
  
    long long gcd(long long A, long long B){
        if(B==0) return A;
        int temp = B;
        B = A%B;
        gcd(temp,B);
    }
    vector<long long> lcmAndGcd(long long A , long long B) {
        vector<long long> res;
        res.push_back(lcm(A,B));
        res.push_back(gcd(A,B));
        return res;
    }
};
