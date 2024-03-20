//1929. Concatenation of Array

class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = Arrays.copyOf(nums,2*n);
        for(int i=n;i<2*n;i++){
            ans[i] = nums[i-n];
        }
        return ans;
    }
}

class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2*n];
        System.arraycopy(nums,0,ans,0,n);
        System.arraycopy(nums,0,ans,n,n);
        //System.arraycopy(nums,0,ans,n,n);
        //source - nums, start_index - 0, dest - ans, 
        //star_index - 0, number_of_elements_to_be_copied - n
        return ans;
    }
}
