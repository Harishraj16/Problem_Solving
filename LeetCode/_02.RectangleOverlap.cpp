class Solution {
public:
    bool isRectangleOverlap(vector<int>& vect1, vector<int>& vect2) {
        int fx1 = vect1[0];
        int fy1 = vect1[1];
        int fx2 = vect1[2];
        int fy2 = vect1[3];
        int sx1 = vect2[0];
        int sy1 = vect2[1];
        int sx2 = vect2[2];
        int sy2 = vect2[3];

        if(sx1>=fx2 || fx1>=sx2 || sy2<=fy1 || fy2<=sy1) return false;
        else return true;
    }
};
