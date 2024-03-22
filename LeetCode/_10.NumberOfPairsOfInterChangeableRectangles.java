//2001. Number of Pairs of Interchangeable Rectangles.
class Solution {
    public long interchangeableRectangles(int[][] nums) {
        int n = nums.length;
        int m = nums[0].length;
        int k=0;
        long count = 0;
        HashMap<Double,Long> mpp = new HashMap<>();
        for(int i=0;i<n;i++){
            double div = (double)nums[i][0]/nums[i][1];
            if(mpp.containsKey(div)) count+=mpp.get(div);
            mpp.put(div,mpp.getOrDefault(div,0L)+1);
        }
        return count;
    }
}
