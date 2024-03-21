//1470. Shuffle the Array
class Solution {
    public int[] shuffle(int[] nums, int n) {
        n = n*2;
        int[] ans = new int[n];
        int ind = 0;
        for(int i=0;i<n/2;i++){
            ans[ind++] = nums[i];
            ans[ind++] = nums[i+n/2];
        }
        return ans;
    }
}
