//1512. Number of Good Pairs

class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j]) count++;
            }
        }
        return count;
    }
}

//Better solution:
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count[] = new int[101];
        int res = 0;
        for(int num: nums){
            res += count[num];
            count[num]++;
        }
        return res;
    }
}
