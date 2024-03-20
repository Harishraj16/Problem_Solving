//1920. Build Array from Permutation
class Solution {
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}


//Using recursion

class Solution {
    public int[] buildArray(int[] nums) {
        permut(nums,0);
        return nums;
    }
    public void permut(int[] nums,int start){
        if(start<nums.length){
            int temp = nums[start];
            int result = nums[temp];
            permut(nums,start+1);
            nums[start] = result;
        }
    }
}
