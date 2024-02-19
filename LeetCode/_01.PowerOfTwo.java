class Solution {
    public boolean isPowerOfTwo(int n) {
        for(int i=0;i<32;i++){
            if(Math.pow(2,i) == n) return true;
        }
        return false;
    }
}

class Solution {
    public boolean isPowerOfTwo(int n) {
       if (n <= 0) {
            return false;
        }
        if (n == 1) {
            return true;
        }
        if (n % 2 == 1) {
            return false;
        }
        return isPowerOfTwo(n / 2);
        
    }
}


class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<1) return false;
        return ((n & (n-1))== 0);
    }
}

