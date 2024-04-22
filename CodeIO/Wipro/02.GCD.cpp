class Solution {
  public:
    int gcd(int a, int b) {
        if(b==0) return a;
        int temp = b;
        b = a%b;
        a = temp;
        gcd(a,b);
    }
};
