//922. Sort Array By Parity II

class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        int odd = 1, even = 0;
        int ans[] = new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]%2!=0){
                ans[odd] = nums[i];
                odd += 2;
            }
            else{
                ans[even] = nums[i];
                even += 2;
            }
        }
        return ans;
    }
}
